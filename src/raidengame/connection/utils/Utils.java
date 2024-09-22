package raidengame.connection.utils;

// Imports
import io.netty.buffer.ByteBuf;
import raidengame.connection.base.PacketIds;
import lombok.Getter;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class Utils {
    @Getter private static final Int2ObjectMap<String> opcodeMap;

    static {
        opcodeMap = new Int2ObjectOpenHashMap<>();
        var fields = PacketIds.class.getFields();
        for (var f : fields) {
            if (f.getType().equals(int.class)) {
                try {
                    opcodeMap.put(f.getInt(null), f.getName());
                } catch (Exception ignored) {
                }
            }
        }
    }

    /**
     * Gets additional information about the opcode. (Like name)
     * @param opcode The given opcode
     * @return The name of opcode.
     */
    public static String getOpcodeName(int opcode) {
        return opcodeMap.getOrDefault(opcode, "UNKNOWN");
    }

    /**
     * Converts from ByteBuf (Netty) to normal array of bytes.
     * @param buf Netty's bytearray.
     * @return Normal bytearray
     */
    public static byte[] byteBufToArray(ByteBuf buf) {
        byte[] bytes = new byte[buf.capacity()];
        buf.getBytes(0, bytes);
        return bytes;
    }
}