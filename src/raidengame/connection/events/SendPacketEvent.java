package raidengame.connection.events;

// Imports
import raidengame.connection.GameSession;
import raidengame.connection.base.BasePacket;
import raidengame.server.events.Cancellable;
import raidengame.server.events.types.ServerEvent;
import lombok.Getter;
import lombok.Setter;

/**
 * Invokes when a new session sends a packet.
 */
@Getter
public final class SendPacketEvent extends ServerEvent implements Cancellable {
    private final GameSession gameSession;
    @Setter private BasePacket packet;

    public SendPacketEvent(GameSession gameSession, BasePacket packet) {
        this.gameSession = gameSession;
        this.packet = packet;
    }
}
