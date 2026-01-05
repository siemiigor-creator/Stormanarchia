package pl.stormanarchia;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pl.stormanarchia.commands.StormAnarchiaCommand;
import pl.stormanarchia.gui.PanelGUI;

public class StormAnarchia extends JavaPlugin {

    private static StormAnarchia instance;

    @Override
    public void onEnable() {
        instance = this;
        getCommand("stormanarchia").setExecutor(new StormAnarchiaCommand());
        Bukkit.getPluginManager().registerEvents(new PanelGUI(), this);
        getLogger().info("StormAnarchia włączona!");
    }

    public static StormAnarchia getInstance() {
        return instance;
    }
}
