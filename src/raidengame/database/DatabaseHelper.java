package raidengame.database;

import static dev.morphia.query.experimental.filters.Filters.eq;
// Imports
import com.mongodb.lang.Nullable;
import raidengame.game.player.Player;
import raidengame.game.player.account.Account;
import dev.morphia.query.experimental.filters.Filters;
import io.netty.util.concurrent.FastThreadLocalThread;
import java.util.Optional;
import java.util.concurrent.*;

public final class DatabaseHelper {
    private static final ExecutorService eventExecutor = new ThreadPoolExecutor(6, 6, 60, TimeUnit.SECONDS,new LinkedBlockingDeque<>(), FastThreadLocalThread::new, new ThreadPoolExecutor.AbortPolicy());

    /**
     * Checks if given player exist.
     * @param uid Player id
     * @return True or False
     */
    public static boolean checkIfPlayerExists(int uid) {
        return DatabaseManager.getGameDatastore().find(Player.class).filter(Filters.eq("_id", uid)).count() > 0;
    }

    /**
     Returns an account object by given user id.
     @param id User id
     @return Account object.
     */
    public static Account getAccountById(String id) {
        return DatabaseManager.getGameDatastore().find(Account.class).filter(eq("_id", id)).first();
    }

    /**
     Returns an account object by username.
     @param username Account name.
     @return Account object.
     */
    public static Account getAccountByName(String username) {
        return DatabaseManager.getGameDatastore().find(Account.class).filter(Filters.eq("username", username)).first();
    }

    /**
     * Fetches the player's data from account object.
     *
     * @param account Account object
     * @return The player.
     */
    public static Player getPlayerByAccount(Account account, Class<? extends Player> playerClass) {
        return DatabaseManager.getGameDatastore().find(playerClass).filter(Filters.eq("accountId", account.getId())).first();
    }

    /**
     * Fetches the player's data from account id.
     *
     * @param accountId The account's ID.
     * @return The player.
     */
    public static Player getPlayerByAccount(String accountId) {
        return DatabaseManager.getGameDatastore().find(Player.class).filter(Filters.eq("accountId", accountId)).first();
    }

    /**
     * Fetches player data by id.
     * @param id player id
     * @return player object
     */
    public static Player getPlayerByUid(int id) {
        return DatabaseManager.getGameDatastore().find(Player.class).filter(Filters.eq("_id", id)).first();
    }

    /**
     * Saves an account object.
     * @param account Account object
     */
    public static void saveAccount(Account account) {
        DatabaseHelper.saveAccountAsync(account);
    }

    /**
     * Saves a player object.
     * @param player Player object
     */
    public static void savePlayer(Player player) {
        DatabaseHelper.saveGameAsync(player);
    }

    /**
     * Gets the next available player id.
     * @param reservedId ID to start.
     */
    public static synchronized int getNextPlayerId(int reservedId) {
        // Check if reserved id
        int id;
        if (reservedId > 0 && !checkIfPlayerExists(reservedId)) {
            id = reservedId;
        } else {
            do {
                id = DatabaseManager.getNextId(Player.class);
            } while (checkIfPlayerExists(id));
        }
        return id;
    }

    /**
     * Generates a new player object with given reserved it.
     * @param player Player object
     */
    public static synchronized void generatePlayerUid(Player player, int reservedId) {
        player.setId(getNextPlayerId(reservedId));
        DatabaseHelper.saveGameAsync(player);
    }

    /**
     * Saves an object on the account datastore.
     *
     * @param object The object to save.
     */
    public static void saveAccountAsync(Object object) {
        DatabaseHelper.eventExecutor.submit(() -> DatabaseManager.getGameDatastore().save(object));
    }

    /**
     * Saves an object on the game datastore.
     *
     * @param object The object to save.
     */
    public static void saveGameAsync(Object object) {
        DatabaseHelper.eventExecutor.submit(() -> DatabaseManager.getGameDatastore().save(object));
    }

    /**
     * Runs a runnable on the event executor. Should be limited to database-related operations.
     *
     * @param runnable The runnable to run.
     */
    public static void asyncOperation(Runnable runnable) {
        DatabaseHelper.eventExecutor.submit(runnable);
    }

    /**
     * Validates an authentication request.
     *
     * @param accountId The account ID.
     * @param token The token.
     * @return {@code true} if the authentication request is valid, otherwise {@code false}.
     */
    @Nullable public static Account authenticateAccount(String accountId, String token) {
        return Optional.ofNullable(DatabaseHelper.getAccountById(accountId)).filter(account -> account.getToken().equals(token)).orElse(null);
    }
}