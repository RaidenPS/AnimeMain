package raidengame.connection.events;

// Imports
import raidengame.connection.GameSession;
import raidengame.server.events.Cancellable;
import raidengame.server.events.types.ServerEvent;
import lombok.Getter;
import lombok.Setter;

/**
 * Invokes when a new session receives a packet.
 */
@Getter
public final class ReceivePacketEvent extends ServerEvent implements Cancellable {
    private final GameSession gameSession;
    private final int packetId;
    @Setter private byte[] packetData;

    public ReceivePacketEvent(GameSession gameSession, int packetId, byte[] packetData) {
        this.gameSession = gameSession;
        this.packetId = packetId;
        this.packetData = packetData;
    }
}
