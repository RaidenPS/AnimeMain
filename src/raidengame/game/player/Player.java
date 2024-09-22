package raidengame.game.player;

// Imports
import raidengame.connection.GameSession;
import raidengame.game.player.account.Account;
import lombok.Getter;
import lombok.Setter;

public class Player {
    private String nickname;
    @Setter @Getter private GameSession session;
    @Getter @Setter private Account account;

    public void onLogout() {

    }
}