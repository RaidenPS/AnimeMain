package raidengame.connection;

// Imports
import raidengame.Main;
import raidengame.misc.classes.FileMan;
import java.io.IOException;
import java.nio.file.Path;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class Encryption {
    public static byte[] DISPATCH_SEED;
    public static byte[] DISPATCH_KEY;
    public static long ENCRYPT_SEED = Long.parseUnsignedLong("11468049314633205968");
    public static byte[] ENCRYPT_KEY;
    public static byte[] ENCRYPT_SEED_BUFFER = new byte[0];
    public static PrivateKey CUR_SIGNING_KEY;
    public static final Map<Integer, PublicKey> EncryptionKeys = new HashMap<>();

    /**
     * Loads all game encryption keys.
     */
    public static void loadCryptoKeys() {
        try {
            DISPATCH_SEED = FileMan.readFile("resources/crypto/dispatchSeed.bin");
            DISPATCH_KEY = FileMan.readFile("resources/crypto/dispatchKey.bin");
            ENCRYPT_KEY = FileMan.readFile("resources/crypto/secretKey.bin");
            ENCRYPT_SEED_BUFFER = FileMan.readFile("resources/crypto/secretKeyBuffer.bin");

            CUR_SIGNING_KEY = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(FileMan.readFile("resources/crypto/SigningKey.der")));
            Pattern pattern = Pattern.compile("([0-9]+)\\.(pub|priv)\\.der");
            for (Path path : FileMan.getPathsFromResource("resources/crypto/gamekeys")) {
                if (path.toString().endsWith(".pub.der")) {
                    var m = pattern.matcher(path.getFileName().toString());
                    if (m.matches()) {
                        var key = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(FileMan.readFile(path.toString())));
                        EncryptionKeys.put(Integer.valueOf(m.group(1)), key);
                    }
                }
            }
            Main.getLogger().debug(String.format("Loaded total public keys: %d", EncryptionKeys.size()));
            Main.getLogger().info("Encryption initialized successfully.");
        }
        catch (IOException e) {
            Main.getLogger().critical("Unable to load the encryption. There was a problem with loading the files.", e);
        }
        catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            Main.getLogger().critical("Unable to load the encryption.", e);
        }
    }
 }
