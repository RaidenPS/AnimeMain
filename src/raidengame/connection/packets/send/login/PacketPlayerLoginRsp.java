package raidengame.connection.packets.send.login;

// Imports
import raidengame.connection.GameSession;
import raidengame.connection.base.BasePacket;
import raidengame.connection.base.PacketIds;

// Protocol buffers
import raidengame.cache.protobuf.PlayerLoginRspOuterClass.PlayerLoginRsp;

public class PacketPlayerLoginRsp extends BasePacket {
    public PacketPlayerLoginRsp(GameSession session) {
        super(PacketIds.PlayerLoginRsp);

        PlayerLoginRsp proto =
            PlayerLoginRsp.newBuilder()
                    .setRetcode(0)
                    /*.setGameBiz("hk4e")
                    .setIsUseAbilityHash(false)
                    .setIsNewPlayer(true)
                    .setTargetUid(100)
                    .setIsEditor(true)
                    .setIsEnableClientHashDebug(true)
                    .setClientVersionSuffix("57a90bbd52")
                    .setClientSilenceVersionSuffix("0af120923b")
                    .setNextResourceUrl("https://autopatchcn.yuanshen.com/client_game_res/5.0_live")
                    .setRegisterCps("epic")*/
                .build();

        this.setData(proto);
    }
}
