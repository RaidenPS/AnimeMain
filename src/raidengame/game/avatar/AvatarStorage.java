package raidengame.game.avatar;

// Imports
import raidengame.game.player.Player;
import java.util.Iterator;

public class AvatarStorage implements Iterable<Avatar> {
    public AvatarStorage(Player player) {

    }

    public int getAvatarCount() {
        return 0;
    }

    @Override
    public Iterator<Avatar> iterator() {
        return null;
    }
}