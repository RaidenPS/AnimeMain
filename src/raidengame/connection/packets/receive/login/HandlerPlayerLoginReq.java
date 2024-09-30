package raidengame.connection.packets.receive.login;

// Imports
import raidengame.connection.GameSession;
import raidengame.connection.base.*;
import com.google.protobuf.InvalidProtocolBufferException;

// Packets
import raidengame.connection.packets.send.login.PacketPlayerLoginRsp;

// Protocol buffers
import raidengame.cache.protobuf.PlayerLoginReqOuterClass.PlayerLoginReq;

@PacketOpcode(PacketIds.PlayerLoginReq)
public class HandlerPlayerLoginReq extends Packet {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws InvalidProtocolBufferException {
        var req = PlayerLoginReq.parseFrom(payload);

        session.send(new PacketPlayerLoginRsp(session));
    }
}
