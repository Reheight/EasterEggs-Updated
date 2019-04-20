package me.reheight.frootseggs.events;

import me.reheight.frootseggs.Main;
import me.reheight.frootseggs.configuration.ConfigurationUtil;
import me.reheight.frootseggs.items.ItemUtil;
import me.reheight.frootseggs.messages.MessagesUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EggInteractUtil implements Listener {
    Main plugin;
    public EggInteractUtil(Main instance) {
        plugin = instance;
    }

    @EventHandler
    public void onItemInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        int amountStack = player.getInventory().getItemInHand().getAmount();
        ItemStack itemInHand = player.getInventory().getItemInHand();
        ItemStack itemStackCheck = new ItemStack(player.getItemInHand());
        itemStackCheck.setAmount(1);

        ArrayList<ItemStack> tiersItemStacks = new ArrayList<>();
        tiersItemStacks.add(ItemUtil.T1);
        tiersItemStacks.add(ItemUtil.T2);
        tiersItemStacks.add(ItemUtil.T3);
        tiersItemStacks.add(ItemUtil.T4);
        tiersItemStacks.add(ItemUtil.T5);

        if (!tiersItemStacks.contains(itemStackCheck)) return;

        if ((event.getAction().equals(Action.RIGHT_CLICK_AIR)) || (event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
            List<String> TierICommands = ConfigurationUtil.TierIConfig.getStringList("Commands");
            List<String> TierIICommands = ConfigurationUtil.TierIIConfig.getStringList("Commands");
            List<String> TierIIICommands = ConfigurationUtil.TierIIIConfig.getStringList("Commands");
            List<String> TierIVCommands = ConfigurationUtil.TierIVConfig.getStringList("Commands");
            List<String> TierVCommands = ConfigurationUtil.TierVConfig.getStringList("Commands");

            Random randomInt = new Random();
            int low = 1;
            int commandsT1Amount = TierICommands.size();
            int commandsT2Amount = TierIICommands.size();
            int commandsT3Amount = TierIIICommands.size();
            int commandsT4Amount = TierIVCommands.size();
            int commandsT5Amount = TierVCommands.size();

            if (itemStackCheck.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier I&8]"))) {
                int commandToRunLine = randomInt.nextInt(commandsT1Amount + 1 - low);

                String commandToRun = TierICommands.get(commandToRunLine);

                itemInHand.setAmount(amountStack - 1);

                player.sendMessage(ChatColor.translateAlternateColorCodes('&', MessagesUtil.prefix + "&fYou have opened a Tier I Easter Egg!"));
                Bukkit.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), commandToRun.replace("/", "").replace("{player}", player.getName()));
                player.getInventory().setItemInHand(itemInHand);
            }

            if (itemStackCheck.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier II&8]"))) {
                int commandToRunLine = randomInt.nextInt(commandsT2Amount + 1 - low);

                String commandToRun = TierIICommands.get(commandToRunLine);

                itemInHand.setAmount(amountStack - 1);

                player.sendMessage(ChatColor.translateAlternateColorCodes('&', MessagesUtil.prefix + "&fYou have opened a Tier II Easter Egg!"));
                Bukkit.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), commandToRun.replace("/", "").replace("{player}", player.getName()));
                player.getInventory().setItemInHand(itemInHand);
            }

            if (itemStackCheck.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier III&8]"))) {
                int commandToRunLine = randomInt.nextInt(commandsT3Amount + 1 - low);

                String commandToRun = TierIIICommands.get(commandToRunLine);

                itemInHand.setAmount(amountStack - 1);

                player.sendMessage(ChatColor.translateAlternateColorCodes('&', MessagesUtil.prefix + "&fYou have opened a Tier III Easter Egg!"));
                Bukkit.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), commandToRun.replace("/", "").replace("{player}", player.getName()));
                player.getInventory().setItemInHand(itemInHand);
            }

            if (itemStackCheck.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier IV&8]"))) {
                int commandToRunLine = randomInt.nextInt(commandsT4Amount + 1 - low);

                String commandToRun = TierIVCommands.get(commandToRunLine);

                itemInHand.setAmount(amountStack - 1);

                player.sendMessage(ChatColor.translateAlternateColorCodes('&', MessagesUtil.prefix + "&fYou have opened a Tier IV Easter Egg!"));
                Bukkit.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), commandToRun.replace("/", "").replace("{player}", player.getName()));
                player.getInventory().setItemInHand(itemInHand);
            }

            if (itemStackCheck.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier V&8]"))) {
                int commandToRunLine = randomInt.nextInt(commandsT5Amount + 1 - low);

                String commandToRun = TierVCommands.get(commandToRunLine);

                itemInHand.setAmount(amountStack - 1);

                player.sendMessage(ChatColor.translateAlternateColorCodes('&', MessagesUtil.prefix + "&fYou have opened a Tier V Easter Egg!"));
                Bukkit.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), commandToRun.replace("/", "").replace("{player}", player.getName()));
                player.getInventory().setItemInHand(itemInHand);
            }
        }

        if ((event.getAction().equals(Action.LEFT_CLICK_AIR)) || (event.getAction().equals(Action.LEFT_CLICK_BLOCK))) {
            if (itemStackCheck.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier I&8]"))) {
                InventoryUtil.openInventory(player, 1);
            }

            if (itemStackCheck.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier II&8]"))) {
                InventoryUtil.openInventory(player, 2);
            }

            if (itemStackCheck.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier III&8]"))) {
                InventoryUtil.openInventory(player, 3);
            }

            if (itemStackCheck.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier IV&8]"))) {
                InventoryUtil.openInventory(player, 4);
            }

            if (itemStackCheck.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier V&8]"))) {
                InventoryUtil.openInventory(player, 5);
            }
        }
    }
}
