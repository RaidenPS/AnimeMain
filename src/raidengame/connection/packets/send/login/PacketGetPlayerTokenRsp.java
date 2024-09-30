package raidengame.connection.packets.send.login;

// Imports
import raidengame.connection.GameSession;
import raidengame.connection.base.BasePacket;
import raidengame.connection.base.PacketIds;

// Protocol buffers
import raidengame.cache.protobuf.GetPlayerTokenRspOuterClass.GetPlayerTokenRsp;

public class PacketGetPlayerTokenRsp extends BasePacket {
    public PacketGetPlayerTokenRsp(GameSession session, int key_id) {
        super(PacketIds.GetPlayerTokenRsp, true);
        this.setUseDispatchKey(true);

        GetPlayerTokenRsp proto =
                GetPlayerTokenRsp.newBuilder()
                        .setRetcode(0)
                        .setToken("1000")
                        .setUid(100)
                        .setKeyId(key_id)
                        .build();

        this.setData(proto);
    }

    public PacketGetPlayerTokenRsp(GameSession session, String encryptedSeed, String encryptedSeedSign) {
        super(PacketIds.GetPlayerTokenRsp, true);
        this.setUseDispatchKey(true);

        GetPlayerTokenRsp proto =
                GetPlayerTokenRsp.newBuilder()
                        .setRetcode(0)
                        .setServerRandKey(encryptedSeed)
                        .setSign(encryptedSeedSign)
                        .setToken("1000")
                        .setUid(100)
                        .setRegPlatform(4)
                        .build();

        this.setData(proto);
    }
}