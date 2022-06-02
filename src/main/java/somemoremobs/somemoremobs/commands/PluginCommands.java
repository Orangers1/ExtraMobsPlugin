package somemoremobs.somemoremobs.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import somemoremobs.somemoremobs.mobs.*;

import static java.lang.Integer.parseInt;

public class PluginCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("spawncustommob")) {
            if (sender.isOp()) {
                if (args[0] != null) { // name of player
                    if (args[1] != null) { // mobs amount

                        int mobCount = parseInt(args[1]);
                        if (Bukkit.getPlayer(args[0]) != null) {
                            Player target = Bukkit.getPlayer(args[0]);

                            if (args[2] != null) {
                                for(int i = 0; i < mobCount; i++) {
                                switch(args[2]) {
                                    case ("teleportingEnderman"):
                                        TeleportingEnderman.summonEnderman(target);
                                        break;
                                    case ("obsidianBox"):
                                        ObbyBox.createBox(target);
                                        break;
                                    case ("deadlyPufferfish"):
                                        DeadlyPufferfish.spawnPufferfish(target);
                                        break;
                                    case ("debuffCaveSpider"):
                                        DebuffCaveSpider.spawnSpider(target);
                                        break;
                                    case ("explosiveArrowSkeleton"):
                                        ExplosiveArrowSkeleton.spawnSkeleton(target);
                                        break;
                                    case ("explosiveWolf"):
                                        ExplosiveWolf.spawnWolf(target);
                                        break;
                                    case ("megaSlime"):
                                        MegaSlime.spawnSlime(target);
                                        break;
                                    case ("piglinArmy"):
                                        PiglinArmy.spawnPiglins(target);
                                        break;
                                    case ("silverfishArmy"):
                                        SilverfishArmy.spawnSilverfish(target);
                                        break;
                                    case ("skeletonRidingPhantom"):
                                        SkeletonRidingPhantom.spawnSkeleton(target);
                                        break;
                                    case ("speedyBlaze"):
                                        SpeedyBlaze.spawnBlaze(target);
                                        break;
                                    case ("spiderStack"):
                                        SpiderStack.spawnSpider(target);
                                        break;
                                }
                                }
                            } else {
                                sender.sendMessage("Please specify the type of mob to spawn!");
                            }
                        } else {
                            sender.sendMessage("That player does not exist!");
                        }
                    } else {
                        sender.sendMessage("You need to specify the quantity of mobs to spawn!");
                    }
                } else {
                    sender.sendMessage("You need to specify a player to Target!");
                }
            }
            return true;
        }
        else if (cmd.getName().equalsIgnoreCase("spawnMobArmy")) {
            if (sender.isOp()) {
                if (args[0] != null) { // name of player
                    if (args[1] != null) { // mobs amount
                        int mobCount = parseInt(args[1]);
                        if (Bukkit.getPlayer(args[0]) != null) {
                            Player target = Bukkit.getPlayer(args[0]);
                            try {
                                EntityType entity = EntityType.valueOf(args[2].toUpperCase());
                                for (int i = 0; i < mobCount; i++) {
                                    target.getLocation().getWorld().spawnEntity(target.getLocation(), entity);
                                }
                            } catch (IllegalArgumentException e) {
                                sender.sendMessage("That is not a valid entity");
                                }
                            } else {
                                sender.sendMessage("Please specify the type of mob to spawn!");
                            }
                        } else {
                            sender.sendMessage("That player does not exist!");
                        }
                    } else {
                        sender.sendMessage("You need to specify the quantity of mobs to spawn!");
                    }
                } else {
                    sender.sendMessage("You need to specify a player to Target!");
                }
            return true;
        }
        return true;
    }
}
