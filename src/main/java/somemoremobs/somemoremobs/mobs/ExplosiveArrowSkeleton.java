package somemoremobs.somemoremobs.mobs;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;

public class ExplosiveArrowSkeleton {
    public static void spawnSkeleton(Player player) {
        Location loc = player.getLocation();
        Skeleton skeleton = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
        skeleton.setCustomName("Explosive Skeleton");
    }
}
