package raidengame.game.player;

// Imports
import raidengame.connection.GameSession;
import raidengame.database.DatabaseHelper;
import raidengame.game.avatar.Avatar;
import raidengame.game.avatar.AvatarStorage;
import raidengame.game.player.account.Account;
import dev.morphia.annotations.*;
import lombok.Getter;
import lombok.Setter;

@Entity(value = "players", useDiscriminator = false)
public class Player {
    @Getter @Setter @Id private int id;
    @Indexed(options = @IndexOptions(unique = true)) @Getter private String accountId;
    @Getter @Setter private transient Account account;
    @Getter @Setter private transient GameSession session;
    @Getter @Setter private String nickname;
    @Getter @Setter private String signature;
    @Getter private transient AvatarStorage avatars;
    @Getter @Setter private int sceneId;

    public Player() {
        this.avatars = new AvatarStorage(this);
    }

    public Player(GameSession session) {
        this();
        this.account = session.getAccount();
        this.accountId = this.getAccount().getId();
        this.session = session;
        this.nickname = session.getAccount().getUsername();
    }

    public int getUid() {
        return id;
    }

    /**
     * Loads the player database.
     */
    public void loadDatabase() {

    }

    /**
     * Invokes when a player logins in the game.
     * @param isNewPlayer The player is for first time in the server (aka registered right now).
     */
    public void onLogin(boolean isNewPlayer) {

    }

    /**
     * Invokes when the player leave the game.
     */
    public void onLogout() {

    }

    /**
     * Adds a new character to the game.
     * @param avatarId Character (Avatar) id.
     * @param isMain Set as main one.
     * @param addToTeam Add to current team.
     */
    public void addAvatar(int avatarId, boolean isMain, boolean addToTeam) {
        //Avatar character = new Avatar(avatarId);

        /// TODO: Add the avatar to the player.
    }

    /**
     * Saves the player database.
     */
    public void saveDatabase() {
        DatabaseHelper.savePlayer(this);
    }
}