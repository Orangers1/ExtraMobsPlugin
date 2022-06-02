package somemoremobs.somemoremobs.mobs;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SkeletonRidingPhantom {
    public static void spawnSkeleton(Player player) {
        Location loc = player.getLocation();
        Skeleton skeleton = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
         Phantom phantom = (Phantom) loc.getWorld().spawnEntity(loc, EntityType.PHANTOM);
         phantom.addPassenger(skeleton);
         PotionEffect fireRes = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 100000000, 1);
         phantom.addPotionEffect(fireRes);
         skeleton.addPotionEffect(fireRes);
         skeleton.setCustomName("Skeleton on a Phantom");
         phantom.setCustomName("Skeleton on a Phantom's Mount");
    }
    }

