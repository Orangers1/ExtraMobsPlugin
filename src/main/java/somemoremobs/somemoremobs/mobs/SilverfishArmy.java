package somemoremobs.somemoremobs.mobs;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Silverfish;

public class SilverfishArmy {
    public static void spawnSilverfish(Player player) {
            Location loc = player.getLocation();
            for (int i = 0; i < 20; i++) {
                Silverfish silverfish = (Silverfish) loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
            }
        }
    }

