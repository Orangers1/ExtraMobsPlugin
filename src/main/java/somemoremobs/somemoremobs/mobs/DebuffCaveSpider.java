package somemoremobs.somemoremobs.mobs;

import org.bukkit.Location;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class DebuffCaveSpider {
    public static void spawnSpider(Player player) {
        Location loc = player.getLocation();
        CaveSpider spider = (CaveSpider) loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
        spider.setCustomName("Debuff Spider");
    }
}
