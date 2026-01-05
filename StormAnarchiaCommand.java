package pl.stormanarchia.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.stormanarchia.gui.PanelGUI;

public class StormAnarchiaCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player player)) return true;

        if (args.length == 1 && args[0].equalsIgnoreCase("panel")) {
            PanelGUI.open(player);
        }
        return true;
    }
}
