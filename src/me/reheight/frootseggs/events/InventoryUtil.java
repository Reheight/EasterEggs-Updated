package me.reheight.frootseggs.events;

import me.reheight.frootseggs.Main;
import me.reheight.frootseggs.configuration.ConfigurationUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class InventoryUtil implements Listener {
    Main plugin;
    public void InventoryUtil(Main instance) {
        plugin = instance;
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&l(!) &fThis server runs Easter Eggs by Reheight!"));
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        String T1Name = ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier I&8]");
        String T2Name = ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier II&8]");
        String T3Name = ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier III&8]");
        String T4Name = ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier IV&8]");
        String T5Name = ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier V&8]");

        if (event.getClickedInventory().getName().equalsIgnoreCase(T1Name)) {
            event.setCancelled(true);
        }

        if (event.getClickedInventory().getName().equalsIgnoreCase(T2Name)) {
            event.setCancelled(true);
        }

        if (event.getClickedInventory().getName().equalsIgnoreCase(T3Name)) {
            event.setCancelled(true);
        }

        if (event.getClickedInventory().getName().equalsIgnoreCase(T4Name)) {
            event.setCancelled(true);
        }

        if (event.getClickedInventory().getName().equalsIgnoreCase(T5Name)) {
            event.setCancelled(true);
        }
    }

    public static void openInventory(Player player, int type) {
        String inventoryName = null;
        List<String> loreToDisplay = new ArrayList<String>();
        if (type == 1) {
            inventoryName = ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier I&8]");
            for (String s : ConfigurationUtil.TierIConfig.getStringList("Rewards")) {
                loreToDisplay.add(ChatColor.translateAlternateColorCodes('&', s));
            }
        } else if (type == 2) {
            inventoryName = ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier II&8]");
            for (String s : ConfigurationUtil.TierIIConfig.getStringList("Rewards")) {
                loreToDisplay.add(ChatColor.translateAlternateColorCodes('&', s));
            }
        } else if (type == 3) {
            inventoryName = ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier III&8]");
            for (String s : ConfigurationUtil.TierIIIConfig.getStringList("Rewards")) {
                loreToDisplay.add(ChatColor.translateAlternateColorCodes('&', s));
            }
        } else if (type == 4) {
            inventoryName = ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier IV&8]");
            for (String s : ConfigurationUtil.TierIVConfig.getStringList("Rewards")) {
                loreToDisplay.add(ChatColor.translateAlternateColorCodes('&', s));
            }
        } else if (type == 5) {
            inventoryName = ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier V&8]");
            for (String s : ConfigurationUtil.TierVConfig.getStringList("Rewards")) {
                loreToDisplay.add(ChatColor.translateAlternateColorCodes('&', s));
            }
        } else {
            return;
        }

        Inventory inventory = Bukkit.createInventory(null, 9, inventoryName);
        ItemStack itemToDisplay = new ItemStack(Material.MONSTER_EGG, 1);
        ItemMeta itemToDisplayMeta = itemToDisplay.getItemMeta();
        itemToDisplayMeta.setDisplayName(inventoryName);
        itemToDisplayMeta.setLore(loreToDisplay);
        itemToDisplay.setItemMeta(itemToDisplayMeta);

        ItemStack barrier = new ItemStack(Material.STAINED_GLASS_PANE, 1);
        ItemMeta barrierMeta = barrier.getItemMeta();
        barrierMeta.setDisplayName(" ");
        barrier.setItemMeta(barrierMeta);
        barrier.setDurability((short) 15);

        inventory.setItem(0, barrier);
        inventory.setItem(1, barrier);
        inventory.setItem(2, barrier);
        inventory.setItem(3, barrier);
        inventory.setItem(4, itemToDisplay);
        inventory.setItem(5, barrier);
        inventory.setItem(6, barrier);
        inventory.setItem(7, barrier);
        inventory.setItem(8, barrier);


        player.openInventory(inventory);
    }
}
