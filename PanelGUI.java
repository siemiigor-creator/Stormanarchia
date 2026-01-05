package pl.stormanarchia.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import pl.stormanarchia.utils.ItemBuilder;

public class PanelGUI implements Listener {

    public static void open(Player player) {
        Inventory inv = Bukkit.createInventory(null, 54, "§8StormAnarchia");

        inv.setItem(11, ItemBuilder.of(Material.LEATHER_CHESTPLATE, "§3Kostiumy"));
        inv.setItem(13, ItemBuilder.head(player, "§6Pety"));
        inv.setItem(15, ItemBuilder.of(Material.GOLDEN_AXE, "§cItemy z Anarchia.gg"));
        inv.setItem(29, ItemBuilder.of(Material.OAK_SIGN, "§aKreator przedmiotów"));
        inv.setItem(31, ItemBuilder.of(Material.BLUE_DYE, "§bKreator Petów"));
        inv.setItem(33, ItemBuilder.of(Material.PINK_DYE, "§9Kreator Kostiumów"));

        player.openInventory(inv);
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (!e.getView().getTitle().equals("§8StormAnarchia")) return;
        e.setCancelled(true);
    }
}
