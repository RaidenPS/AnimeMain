package raidengame.misc.classes;

public final class Base64 {
    /**
     * Performs base64 decoding on given string.
     * @param toDecode The encoded string.
     * @return Bytes
     */
    public static byte[] base64Decode(String toDecode) {
        return java.util.Base64.getDecoder().decode(toDecode);
    }

    /**
     * Performs base64 encoding on given bytes.
     * @param toEncode Bytes
     * @return Base64 string.
     */
    public static String base64Encode(byte[] toEncode) {
        return java.util.Base64.getEncoder().encodeToString(toEncode);
    }
}
