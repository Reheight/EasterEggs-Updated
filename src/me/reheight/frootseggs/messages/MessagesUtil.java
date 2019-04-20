package me.reheight.frootseggs.messages;

import org.bukkit.ChatColor;

public class MessagesUtil {
    public static String prefix = ChatColor.translateAlternateColorCodes('&', "&aFrootsMC &8» &f");
    public static String tooLessArguments = ChatColor.translateAlternateColorCodes('&', prefix + "You provided the invalid usage!");
    public static String tooManyArguments = ChatColor.translateAlternateColorCodes('&', prefix + "You provided too many arguments!");
    public static String noPermission = ChatColor.translateAlternateColorCodes('&', prefix + "You do not have sufficient permissions!");
    public static String noTierProvided = ChatColor.translateAlternateColorCodes('&', prefix + "You must specify a tier!");
    public static String noTierExists = ChatColor.translateAlternateColorCodes('&', prefix + "Invalid tier provided!");
    public static String inventoryFull = ChatColor.translateAlternateColorCodes('&', prefix + "That players inventory is full!");
    public static String baseCommandNoPermission = ChatColor.translateAlternateColorCodes('&', prefix + "This server is running Froots Eggs, made by Reheight!");
    public static String baseCommand = ChatColor.translateAlternateColorCodes('&', prefix + "\n" +
            "&7&o/frootseegs give (player) (tier) (amount) - Give a Froots Egg to a player!" + "\n" +
            "&7&o/frootseggs giveall (tier) (amount) - Give everyone online a Froots Egg!");
    public static String giveInvalidArguments = ChatColor.translateAlternateColorCodes('&', prefix + "/frootseggs give (player) (tier) (amount)");
    public static String giveAllInvalidArguments = ChatColor.translateAlternateColorCodes('&', prefix + "/frootseggs giveall (tier) (amount)");
    public static String specifiedPlayerOffline = ChatColor.translateAlternateColorCodes('&', prefix + "The specified player is not online!");
    public static String invalidTierSpecified = ChatColor.translateAlternateColorCodes('&', prefix + "You specified an invalid or unsupported tier!");
    public static String invalidAmountSpecified = ChatColor.translateAlternateColorCodes('&', prefix + "You specified an invalid or unsupported amount!");
}
