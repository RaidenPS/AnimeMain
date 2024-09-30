package raidengame.connection.packets.receive.login;

// Imports
import com.google.protobuf.InvalidProtocolBufferException;
import raidengame.connection.Encryption;
import raidengame.connection.GameSession;
import raidengame.connection.SessionState;
import raidengame.connection.base.*;
import raidengame.misc.classes.CustomPair;

// Packets
import raidengame.connection.packets.send.login.PacketGetPlayerTokenRsp;

// Protocol buffers
import raidengame.cache.protobuf.GetPlayerTokenReqOuterClass.GetPlayerTokenReq;

@PacketOpcode(PacketIds.GetPlayerTokenReq)
public class HandlerGetPlayerTokenReq extends Packet {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws InvalidProtocolBufferException {
        var req = GetPlayerTokenReq.parseFrom(payload);


        session.setUseSecretKey(true);
        session.setState(SessionState.WAITING_FOR_LOGIN);
        if (req.getKeyId() > 0) {
            CustomPair<String, String> signature = Encryption.prepareRegionLoginSignature(session.getEncryptSeed(), req.getClientRandKey(), req.getKeyId());
            if(signature != null) {
                session.send(new PacketGetPlayerTokenRsp(session, signature.getKey(), signature.getValue()));
            }
            else {
                /// Encryption failed.
            }
        }
        else {
            session.send(new PacketGetPlayerTokenRsp(session, req.getKeyId()));
        }
    }
}