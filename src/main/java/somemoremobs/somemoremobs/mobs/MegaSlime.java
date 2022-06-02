package somemoremobs.somemoremobs.mobs;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;

public class MegaSlime {
    public static void spawnSlime(Player player) {
        Location loc = player.getLocation();
        Slime slime = (Slime) loc.getWorld().spawnEntity(loc, EntityType.SLIME);
        slime.setSize(8);
        slime.setCustomName(ChatColor.GREEN + "Mega Slime");
    }
}
