package somemoremobs.somemoremobs.mobs;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;

public class PiglinArmy {
    public static void spawnPiglins(Player player) {
        Location loc = player.getLocation();
        for (int i = 0; i < 20; i++) {
            Piglin piglin = (Piglin) loc.getWorld().spawnEntity(loc, EntityType.PIGLIN);
        }
    }
}
