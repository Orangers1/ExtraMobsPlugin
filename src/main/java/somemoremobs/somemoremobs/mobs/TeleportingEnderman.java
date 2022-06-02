package somemoremobs.somemoremobs.mobs;

import org.bukkit.Location;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class TeleportingEnderman {
    public static void summonEnderman(Player player) {
        Location loc = player.getLocation();
        Enderman enderman = (Enderman) loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
        enderman.setCustomName("Teleporting Enderman");
    }
}
