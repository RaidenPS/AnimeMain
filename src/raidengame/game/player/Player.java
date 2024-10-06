package raidengame.game.player;

// Imports
import raidengame.connection.GameSession;
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

    public void onLogout() {
    }

    public int getUid() {
        return 100002;
    }

    public void loadDatabase() {

    }

    public void onLogin(boolean isNewPlayer) {

    }
}