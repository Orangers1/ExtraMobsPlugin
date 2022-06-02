package somemoremobs.somemoremobs;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import somemoremobs.somemoremobs.commands.PluginCommands;
import somemoremobs.somemoremobs.events.PluginEvents;

public final class SomeMoreMobs extends JavaPlugin {

    @Override
    public void onEnable() {

        PluginCommands commands = new PluginCommands();
        getCommand("spawncustommob").setExecutor(commands);
        getCommand("spawnmobarmy").setExecutor(commands);

        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN  + "[ExtraMobs]: Commands are Initialized!");
        getServer().getPluginManager().registerEvents(new PluginEvents(), this);


        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[ExtraMobs]: Plugin is Fully Enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[ExtraMobs]: Plugin is Disabled!");
    }
}
