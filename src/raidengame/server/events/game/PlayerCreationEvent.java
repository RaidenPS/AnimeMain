package raidengame.server.events.game;

// Imports
import raidengame.connection.GameSession;
import raidengame.game.player.Player;
import raidengame.server.events.types.GameEvent;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class PlayerCreationEvent extends GameEvent {
    private final GameSession session;
    @Setter private Class<? extends Player> playerClass;

    public PlayerCreationEvent(GameSession session, Class<? extends Player> playerClass) {
        this.session = session;
        this.playerClass = playerClass;
    }
}
