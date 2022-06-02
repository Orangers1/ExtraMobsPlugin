package somemoremobs.somemoremobs.mobs;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class ObbyBox {
    public static void createBox(Player player) {
        Location loc = player.getLocation();
        int x = (int) loc.getX()    ;
        int y = (int) loc.getY();
        int z = (int) loc.getZ() ;
        loc.getWorld().setBlockData(x, y-1, z, Material.CRYING_OBSIDIAN.createBlockData());

        loc.getWorld().setBlockData(x, y, z-1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x, y, z+1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x-1, y, z, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x+1, y, z, Material.CRYING_OBSIDIAN.createBlockData());

        loc.getWorld().setBlockData(x, y+1, z-1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x, y+1, z+1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x-1, y+1, z, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x+1, y+1, z, Material.CRYING_OBSIDIAN.createBlockData());

        loc.getWorld().setBlockData(x, y+2, z-1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x, y+2, z+1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x-1, y+2, z, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x+1, y+2, z, Material.CRYING_OBSIDIAN.createBlockData());

        loc.getWorld().setBlockData(x, y+3, z-1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x, y+3, z+1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x-1, y+3, z, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x+1, y+3, z, Material.CRYING_OBSIDIAN.createBlockData());

        loc.getWorld().setBlockData(x, y+4, z-1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x, y+4, z+1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x-1, y+4, z, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x+1, y+4, z, Material.CRYING_OBSIDIAN.createBlockData());

        loc.getWorld().setBlockData(x, y+5, z-1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x, y+5, z+1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x-1, y+5, z, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x+1, y+5, z, Material.CRYING_OBSIDIAN.createBlockData());

        loc.getWorld().setBlockData(x, y+6, z-1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x, y+6, z+1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x-1, y+6, z, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x+1, y+6, z, Material.CRYING_OBSIDIAN.createBlockData());

        loc.getWorld().setBlockData(x, y+6, z-1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x, y+6, z+1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x-1, y+6, z, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x+1, y+6, z, Material.CRYING_OBSIDIAN.createBlockData());

        loc.getWorld().setBlockData(x, y+7, z-1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x, y+7, z+1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x-1, y+7, z, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x+1, y+7, z, Material.CRYING_OBSIDIAN.createBlockData());

        loc.getWorld().setBlockData(x, y+8, z-1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x, y+8, z+1, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x-1, y+8, z, Material.CRYING_OBSIDIAN.createBlockData());
        loc.getWorld().setBlockData(x+1, y+8, z, Material.CRYING_OBSIDIAN.createBlockData());

        loc.getWorld().setBlockData(x, y+8, z, Material.LAVA.createBlockData());
        loc.getWorld().setBlockData(x, y+9, z, Material.CRYING_OBSIDIAN.createBlockData());

    }

}
