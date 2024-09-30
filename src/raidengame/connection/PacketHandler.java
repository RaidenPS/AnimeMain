package raidengame.connection;

// Imports
import raidengame.Main;
import raidengame.connection.base.PacketOpcode;
import raidengame.connection.base.Packet;
import raidengame.connection.base.PacketIds;
import raidengame.connection.events.ReceivePacketEvent;
import raidengame.connection.utils.PacketMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public final class PacketHandler {
    private final Int2ObjectMap<Packet> handlers;

    public PacketHandler(Class<? extends Packet> handlerClass) {
        this.handlers = new Int2ObjectOpenHashMap<>();
        this.registerHandlers(handlerClass);
    }

    public void registerPacketHandler(Class<? extends Packet> handlerClass) {
        try {
            var opcode = handlerClass.getAnnotation(PacketOpcode.class);
            if (opcode == null || opcode.disabled() || opcode.value() <= 0) {
                return;
            }
            var packetHandler = handlerClass.getDeclaredConstructor().newInstance();
            this.handlers.put(opcode.value(), packetHandler);
        } catch (Exception e) {
            Main.getLogger().warn("Unable to register handler: %s", handlerClass.getSimpleName());
        }
    }

    public void registerHandlers(Class<? extends Packet> handlerClass) {
        var handlerClasses = Main.reflector.getSubTypesOf(handlerClass);
        for (var obj : handlerClasses) {
            this.registerPacketHandler(obj);
        }
        Main.getLogger().debug("Total registered packets: %d.", this.handlers.size());
    }

    public void handle(GameSession session, int opcode, byte[] header, byte[] payload) {
        Packet handler = this.handlers.get(opcode);
        if (handler != null) {
            try {
                SessionState state = session.getState();
                switch (opcode) {
                    case PacketIds.PingReq:
                        break;
                    case PacketIds.GetPlayerTokenReq:
                        if (state != SessionState.WAITING_FOR_TOKEN) {
                            return;
                        }
                        break;
                    case PacketIds.PlayerLoginReq:
                        if (state != SessionState.WAITING_FOR_LOGIN) {
                            return;
                        }
                        break;
                    case PacketIds.SetPlayerBornDataReq:
                        if (state != SessionState.PICKING_CHARACTER) {
                            return;
                        }
                        break;
                    default:
                        if (state == SessionState.ACCOUNT_BANNED) {
                            session.close();
                            return;
                        }
                        if (state != SessionState.ACTIVE) {
                            return;
                        }
                        break;
                }
                ReceivePacketEvent event = new ReceivePacketEvent(session, opcode, payload);
                event.call();
                if (!event.isCanceled()) handler.handle(session, header, event.getPacketData());
            } catch (Exception ex) {
                Main.getLogger().error(ex.getMessage());
            }
            return;
        }
        Main.getLogger().info("Unhandled packet (%d): %s", opcode, PacketMap.getOpcodeName(opcode));
    }
}
