package raidengame.connection.utils;

import io.netty.buffer.ByteBuf;

public final class Utils {
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
