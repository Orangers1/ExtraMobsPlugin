package somemoremobs.somemoremobs.mobs;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ExplosiveWolf {
    public static void spawnWolf(Player player) {
        Location loc = player.getLocation();
        Wolf wolf = (Wolf) loc.getWorld().spawnEntity(loc, EntityType.WOLF);
        Creeper creeper = (Creeper) loc.getWorld().spawnEntity(loc, EntityType.CREEPER);
        creeper.setCustomName("Explosive Wolf");
        PotionEffect invis = new PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 2);
        creeper.addPotionEffect(invis);
          wolf.addPassenger(creeper);
        wolf.setCustomName(ChatColor.RED + "Explosive Wolf");

    }
}
