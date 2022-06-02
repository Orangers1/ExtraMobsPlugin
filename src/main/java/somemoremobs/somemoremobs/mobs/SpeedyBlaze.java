package somemoremobs.somemoremobs.mobs;

import org.bukkit.Location;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpeedyBlaze {
    public static void spawnBlaze(Player player) {
        Location loc = player.getLocation();
        Blaze blaze = (Blaze) loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
        PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, 100000000, 8);
        blaze.addPotionEffect(speed);
    }
}
