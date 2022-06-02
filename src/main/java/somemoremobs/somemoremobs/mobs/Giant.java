package somemoremobs.somemoremobs.mobs;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;

public class Giant {
   public static void summonGiant(Player player) {
       Location loc = player.getLocation();
       Giant giant = (Giant) loc.getWorld().spawnEntity(loc, EntityType.GIANT);

    }
}
