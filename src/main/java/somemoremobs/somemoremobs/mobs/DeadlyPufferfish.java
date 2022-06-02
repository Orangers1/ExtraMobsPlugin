package somemoremobs.somemoremobs.mobs;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.PufferFish;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DeadlyPufferfish {
    public static void spawnPufferfish(Player player) {
        Location loc = player.getLocation();
        PufferFish pufferFish = (PufferFish) loc.getWorld().spawnEntity(loc, EntityType.PUFFERFISH);
        pufferFish.setCustomName("Deadly PufferFish");
        PotionEffect damage = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100000000, 6);
        pufferFish.addPotionEffect(damage);
        PotionEffect breath = new PotionEffect(PotionEffectType.WATER_BREATHING, 100000000, 3);
        pufferFish.addPotionEffect(breath);
        loc.getWorld().setBlockData(loc, Material.WATER.createBlockData());

    }
}
