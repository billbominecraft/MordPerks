package me.billbominecraft.mordperks;

import me.billbominecraft.mordperks.commands.MordPerksCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class MordPerks extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        System.out.println("MordPerks is now enabled!");

        getCommand("mordperks").setExecutor(new MordPerksCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("MordPerks is now disabled!");

    }
}
