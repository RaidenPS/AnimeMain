package raidengame.connection.packets.receive;

// Imports
import raidengame.connection.GameSession;
import raidengame.connection.base.*;

// Packets
import raidengame.connection.packets.send.PacketPingRsp;

// Protocol buffers
import raidengame.cache.protobuf.PacketHeadOuterClass.PacketHead;
import raidengame.cache.protobuf.PingReqOuterClass.PingReq;

@PacketOpcode(PacketIds.PingReq)
public class HandlerPingReq extends Packet {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        PacketHead head = PacketHead.parseFrom(header);
        PingReq req = PingReq.parseFrom(payload);

        session.updateLastPingTime(req.getClientTime());
        session.send(new PacketPingRsp(head.getClientSequenceId(), req.getClientTime()));
    }
}
