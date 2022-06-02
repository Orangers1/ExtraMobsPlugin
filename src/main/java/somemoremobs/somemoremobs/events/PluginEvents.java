package somemoremobs.somemoremobs.events;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class PluginEvents implements Listener {

    @EventHandler
    public static void onExplosiveArrowLand(ProjectileHitEvent event) {
    Projectile projectile = (Projectile) event.getEntity();
    Location loc = projectile.getLocation();
    if (projectile.getShooter() instanceof Entity) {
        Entity shooter = (Entity) projectile.getShooter();
        if (shooter.getCustomName().equalsIgnoreCase("Explosive Skeleton"));
    }

    loc.getWorld().createExplosion(loc, 5f);
    }
    @EventHandler
    public static void debuffSpiderHit(EntityDamageByEntityEvent event) {
        Entity damaged = event.getEntity();
        Entity damager = event.getDamager();
        if (damager.getName().equalsIgnoreCase("Debuff Spider")) {
            if (damaged instanceof Player) {
                PotionEffect effects = new PotionEffect(PotionEffectType.POISON, 1200, 0);
                PotionEffect effects1 = new PotionEffect(PotionEffectType.SLOW, 1200, 1);
                PotionEffect effects2 = new PotionEffect(PotionEffectType.CONFUSION, 1200, 2);
                PotionEffect effects3 = new PotionEffect(PotionEffectType.BLINDNESS, 1200, 1);
                PotionEffect effects4 = new PotionEffect(PotionEffectType.SLOW_DIGGING, 1200, 0);

                ((Player) damaged).addPotionEffect(effects);
                ((Player) damaged).addPotionEffect(effects1);
                ((Player) damaged).addPotionEffect(effects2);
                ((Player) damaged).addPotionEffect(effects3);
                ((Player) damaged).addPotionEffect(effects4);

            }

        } else if (damager.getName().equalsIgnoreCase("Teleporting Enderman")) {
            Location newLoc = damaged.getLocation();
            if (damaged instanceof Player) {
                double x = newLoc.getX();
                double y = newLoc.getY();
                double z = newLoc.getZ();
                int xadd = randomNumber(0, 10);
                int yadd = randomNumber(0, 10);
                int zadd = randomNumber(0, 10);
                int xdet = randomNumber(0, 1);
                int ydet = randomNumber(0, 3);
                int zdet = randomNumber(0, 1);

                if (xdet == 0) {
                    xadd = xadd*-1;
                }
                if (ydet == 0) {
                    yadd = yadd*-1;
                }
                if (zdet == 0) {
                    zadd = zadd*-1;
                }
                newLoc.setX(x + xadd);
                newLoc.setY(y + yadd);
                newLoc.setZ(z + zadd);

                damaged.teleport(newLoc);
            }
        }
    }
    public static int randomNumber(int minInt, int maxInt) {
        if (minInt >= maxInt) {
            throw new IllegalArgumentException("Error: The maxInt is smaller than the minInt!");
            // Or if you wan't to do it easy:
            // return 0; // Will return 0, if minInt is bigger than maxInt
        }

        Random random = new Random();
        return random.nextInt((maxInt - minInt) + 1) + minInt;
    }
}
