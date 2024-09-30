package raidengame.connection.base;

// Imports
import raidengame.connection.GameSession;
import com.google.protobuf.InvalidProtocolBufferException;

public abstract class Packet {
    public abstract void handle(GameSession session, byte[] header, byte[] payload) throws InvalidProtocolBufferException;
}
