package me.reheight.frootseggs.items;

import me.reheight.frootseggs.Utils.alphanumericGenerator;
import me.reheight.frootseggs.messages.MessagesUtil;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemUtil implements Listener {
    public static ItemStack T1;
    public static ItemStack T2;
    public static ItemStack T3;
    public static ItemStack T4;
    public static ItemStack T5;

    public ItemUtil() {
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', ""));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left Click for Possible Rewards"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right Click to use"));

        T1 = new ItemStack(Material.MONSTER_EGG);
        ItemMeta T1Meta = T1.getItemMeta();
        T1Meta.setLore(lore);
        T1Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier I&8]"));
        T1.setItemMeta(T1Meta);
        //
        T2 = new ItemStack(Material.MONSTER_EGG);
        ItemMeta T2Meta = T2.getItemMeta();
        T2Meta.setLore(lore);
        T2Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier II&8]"));
        T2.setItemMeta(T2Meta);
        //
        T3 = new ItemStack(Material.MONSTER_EGG);
        ItemMeta T3Meta = T3.getItemMeta();
        T3Meta.setLore(lore);
        T3Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier III&8]"));
        T3.setItemMeta(T3Meta);
        //
        T4 = new ItemStack(Material.MONSTER_EGG);
        ItemMeta T4Meta = T4.getItemMeta();
        T4Meta.setLore(lore);
        T4Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier IV&8]"));
        T4.setItemMeta(T4Meta);
        //
        T5 = new ItemStack(Material.MONSTER_EGG);
        ItemMeta T5Meta = T5.getItemMeta();
        T5Meta.setLore(lore);
        T5Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier V&8]"));
        T5.setItemMeta(T5Meta);
    }

    public void giveTierI(CommandSender sender, Player reciever, int amount) {
        ItemStack TierI = new ItemStack(Material.MONSTER_EGG, amount);
        ItemMeta TierIMeta = TierI.getItemMeta();

        TierIMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier I&8]"));

        ArrayList<String> TierILore = new ArrayList<>();
        TierILore.add(ChatColor.translateAlternateColorCodes('&', ""));
        TierILore.add(ChatColor.translateAlternateColorCodes('&', "&7Left Click for Possible Rewards"));
        TierILore.add(ChatColor.translateAlternateColorCodes('&', "&7Right Click to use"));

        TierIMeta.setLore(TierILore);
        TierI.setItemMeta(TierIMeta);

        if (reciever.getInventory().firstEmpty() == -1) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', MessagesUtil.inventoryFull));
            return;
        }

        reciever.getInventory().addItem(TierI);

        reciever.sendMessage(MessagesUtil.prefix + ChatColor.translateAlternateColorCodes('&', "&fYou have been given " + amount + "x Tier I Egg(s) by," + sender.getName()));
        if (sender instanceof Player) {
            sender.sendMessage(MessagesUtil.prefix + ChatColor.translateAlternateColorCodes('&', "&fYou have given " + reciever.getName() + ", " + amount + "x Tier I Egg(s)!"));
        }
        return;
    }

    public void giveTierII(CommandSender sender, Player reciever, int amount) {
        ItemStack TierII = new ItemStack(Material.MONSTER_EGG, amount);
        ItemMeta TierIIMeta = TierII.getItemMeta();

        TierIIMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier II&8]"));

        ArrayList<String> TierIILore = new ArrayList<>();
        TierIILore.add(ChatColor.translateAlternateColorCodes('&', ""));
        TierIILore.add(ChatColor.translateAlternateColorCodes('&', "&7Left Click for Possible Rewards"));
        TierIILore.add(ChatColor.translateAlternateColorCodes('&', "&7Right Click to use"));

        TierIIMeta.setLore(TierIILore);
        TierII.setItemMeta(TierIIMeta);

        if (reciever.getInventory().firstEmpty() == -1) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', MessagesUtil.inventoryFull));
            return;
        }

        reciever.getInventory().addItem(TierII);

        reciever.sendMessage(MessagesUtil.prefix + ChatColor.translateAlternateColorCodes('&', "&fYou have been given " + amount + "x Tier II Egg(s) by," + sender.getName()));
        if (sender instanceof Player) {
            sender.sendMessage(MessagesUtil.prefix + ChatColor.translateAlternateColorCodes('&', "&fYou have given " + reciever.getName() + ", " + amount + "x Tier II Egg(s)!"));
        }
        return;
    }

    public void giveTierIII(CommandSender sender, Player reciever, int amount) {
        ItemStack TierIII = new ItemStack(Material.MONSTER_EGG, amount);
        ItemMeta TierIIIMeta = TierIII.getItemMeta();

        TierIIIMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier III&8]"));

        ArrayList<String> TierIIILore = new ArrayList<>();
        TierIIILore.add(ChatColor.translateAlternateColorCodes('&', ""));
        TierIIILore.add(ChatColor.translateAlternateColorCodes('&', "&7Left Click for Possible Rewards"));
        TierIIILore.add(ChatColor.translateAlternateColorCodes('&', "&7Right Click to use"));

        TierIIIMeta.setLore(TierIIILore);
        TierIII.setItemMeta(TierIIIMeta);

        if (reciever.getInventory().firstEmpty() == -1) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', MessagesUtil.inventoryFull));
            return;
        }

        reciever.getInventory().addItem(TierIII);

        reciever.sendMessage(MessagesUtil.prefix + ChatColor.translateAlternateColorCodes('&', "&fYou have been given " + amount + "x Tier III Egg(s) by," + sender.getName()));
        if (sender instanceof Player) {
            sender.sendMessage(MessagesUtil.prefix + ChatColor.translateAlternateColorCodes('&', "&fYou have given " + reciever.getName() + ", " + amount + "x Tier III Egg(s)!"));
        }
        return;
    }

    public void giveTierIV(CommandSender sender, Player reciever, int amount) {
        ItemStack TierIV = new ItemStack(Material.MONSTER_EGG, amount);
        ItemMeta TierIVMeta = TierIV.getItemMeta();

        TierIVMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier IV&8]"));

        ArrayList<String> TierIVLore = new ArrayList<>();
        TierIVLore.add(ChatColor.translateAlternateColorCodes('&', ""));
        TierIVLore.add(ChatColor.translateAlternateColorCodes('&', "&7Left Click for Possible Rewards"));
        TierIVLore.add(ChatColor.translateAlternateColorCodes('&', "&7Right Click to use"));

        TierIVMeta.setLore(TierIVLore);
        TierIV.setItemMeta(TierIVMeta);

        if (reciever.getInventory().firstEmpty() == -1) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', MessagesUtil.inventoryFull));
            return;
        }

        reciever.getInventory().addItem(TierIV);

        reciever.sendMessage(MessagesUtil.prefix + ChatColor.translateAlternateColorCodes('&', "&fYou have been given " + amount + "x Tier IV Egg(s) by," + sender.getName()));
        if (sender instanceof Player) {
            sender.sendMessage(MessagesUtil.prefix + ChatColor.translateAlternateColorCodes('&', "&fYou have given " + reciever.getName() + ", " + amount + "x Tier IV Egg(s)!"));
        }
        return;
    }

    public void giveTierV(CommandSender sender, Player reciever, int amount) {
        ItemStack TierV = new ItemStack(Material.MONSTER_EGG, amount);
        ItemMeta TierVMeta = TierV.getItemMeta();

        TierVMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Easter Egg &8[&aTier V&8]"));

        ArrayList<String> TierVLore = new ArrayList<>();
        TierVLore.add(ChatColor.translateAlternateColorCodes('&', ""));
        TierVLore.add(ChatColor.translateAlternateColorCodes('&', "&7Left Click for Possible Rewards"));
        TierVLore.add(ChatColor.translateAlternateColorCodes('&', "&7Right Click to use"));

        TierVMeta.setLore(TierVLore);
        TierV.setItemMeta(TierVMeta);

        if (reciever.getInventory().firstEmpty() == -1) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', MessagesUtil.inventoryFull));
            return;
        }

        reciever.getInventory().addItem(TierV);

        reciever.sendMessage(MessagesUtil.prefix + ChatColor.translateAlternateColorCodes('&', "&fYou have been given " + amount + "x Tier V Egg(s) by," + sender.getName()));
        if (sender instanceof Player) {
            sender.sendMessage(MessagesUtil.prefix + ChatColor.translateAlternateColorCodes('&', "&fYou have given " + reciever.getName() + ", " + amount + "x Tier V Egg(s)!"));
        }
        return;
    }
}
