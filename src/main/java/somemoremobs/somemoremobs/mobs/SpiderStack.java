package somemoremobs.somemoremobs.mobs;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Spider;

public class SpiderStack {
    public static void spawnSpider(Player player) {
        Location loc = player.getLocation();
        Spider stackPrevious = (Spider) loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
        stackPrevious.setCustomName(ChatColor.BLUE + "Spider Stack");
        for (int i = 0; i < 49; i++) {
            Spider stacki = (Spider) loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
            stacki.setCustomName(ChatColor.BLUE + "Spider Stack");
            stacki.addPassenger(stackPrevious);

            stackPrevious = stacki;
        }
    }
}
