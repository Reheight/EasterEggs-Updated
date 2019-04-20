package me.reheight.frootseggs.commands;

import me.reheight.frootseggs.Main;
import me.reheight.frootseggs.events.CommandUtil;
import me.reheight.frootseggs.messages.MessagesUtil;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class BaseCommand implements CommandExecutor {
    Main plugin;
    public BaseCommand(Main instance) {
        plugin = instance;
    }

    private CommandUtil commandUtil = new CommandUtil();

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("frootseggs")) {
            if (sender instanceof ConsoleCommandSender) {
                ConsoleCommandSender player = Bukkit.getConsoleSender();
                if (args.length == 0) {
                    player.sendMessage(MessagesUtil.baseCommand);
                    return true;
                }

                if (args.length >= 1) {
                    if (args[0].equalsIgnoreCase("give")) {
                        if (!player.hasPermission("frootseggs.give")) {
                            plugin.getLogger().info(MessagesUtil.noPermission);
                            return true;
                        }

                        if ((args.length == 2) || (args.length == 3) || (args.length > 4)) {
                            plugin.getLogger().info(MessagesUtil.giveInvalidArguments);
                            return true;
                        } else {
                            Player reciever = Bukkit.getPlayer(args[1]);
                            if ((!reciever.isOnline()) || (reciever == null) || (!reciever.hasPlayedBefore())) {
                                plugin.getLogger().info(MessagesUtil.specifiedPlayerOffline);
                                return true;
                            }

                            int tier;

                            try {
                                tier = Integer.parseInt(args[2]);
                            } catch (NumberFormatException e) {
                                plugin.getLogger().info(MessagesUtil.invalidTierSpecified);
                                return true;
                            }

                            int amount;
                            try {
                                amount = Integer.parseInt(args[3]);
                            } catch (NumberFormatException e) {
                                plugin.getLogger().info(MessagesUtil.invalidAmountSpecified);
                                return true;
                            }
                            commandUtil.tierRetriver(player, reciever, tier, amount);
                            return true;
                        }
                    } else if (args[0].equalsIgnoreCase("giveall")) {
                        if ((args.length == 1)  || (args.length == 2) || (args.length > 3)) {
                            plugin.getLogger().info(MessagesUtil.giveAllInvalidArguments);
                            return true;
                        } else {
                            int tier;

                            try {
                                tier = Integer.parseInt(args[1]);
                            } catch (NumberFormatException e) {
                                plugin.getLogger().info(MessagesUtil.invalidTierSpecified);
                                return true;
                            }

                            int amount;
                            try {
                                amount = Integer.parseInt(args[2]);
                            } catch (NumberFormatException e) {
                                plugin.getLogger().info(MessagesUtil.invalidAmountSpecified);
                                return true;
                            }
                            for (Player reciever : Bukkit.getServer().getOnlinePlayers()) {
                                commandUtil.tierRetriver(player, reciever, tier, amount);
                            }
                            return true;
                        }
                    } else {
                        plugin.getLogger().info(MessagesUtil.baseCommand);
                        return true;
                    }
                }
                return true;
            }
            Player player = (Player)sender;
            if (!player.hasPermission("frootseggs.use")) {
                player.sendMessage(MessagesUtil.baseCommandNoPermission);
                return true;
            }

            if (args.length == 0) {
                player.sendMessage(MessagesUtil.baseCommand);
                return true;
            }

            if (args.length >= 1) {
                if (args[0].equalsIgnoreCase("give")) {
                    if (!player.hasPermission("frootseggs.give")) {
                        player.sendMessage(MessagesUtil.noPermission);
                        return true;
                    }

                    if ((args.length == 2) || (args.length == 3) || (args.length > 4)) {
                        player.sendMessage(MessagesUtil.giveInvalidArguments);
                        return true;
                    } else {
                        Player reciever = Bukkit.getPlayer(args[1]);
                        if ((!reciever.isOnline()) || (reciever == null) || (!reciever.hasPlayedBefore())) {
                            player.sendMessage(MessagesUtil.specifiedPlayerOffline);
                            return true;
                        }

                        int tier;

                        try {
                            tier = Integer.parseInt(args[2]);
                        } catch (NumberFormatException e) {
                            player.sendMessage(MessagesUtil.invalidTierSpecified);
                            return true;
                        }

                        int amount;
                        try {
                            amount = Integer.parseInt(args[3]);
                        } catch (NumberFormatException e) {
                            player.sendMessage(MessagesUtil.invalidAmountSpecified);
                            return true;
                        }
                        commandUtil.tierRetriver(player, reciever, tier, amount);
                        return true;
                    }
                } else if (args[0].equalsIgnoreCase("giveall")) {
                    if (!player.hasPermission("frootseggs.giveall")) {
                        player.sendMessage(MessagesUtil.noPermission);
                        return true;
                    }
                    if ((args.length == 1) || (args.length == 2) || (args.length > 3)) {
                        player.sendMessage(MessagesUtil.giveAllInvalidArguments);
                        return true;
                    } else {
                        int tier;

                        try {
                            tier = Integer.parseInt(args[1]);
                        } catch (NumberFormatException e) {
                            player.sendMessage(MessagesUtil.invalidTierSpecified);
                            return true;
                        }

                        int amount;
                        try {
                            amount = Integer.parseInt(args[2]);
                        } catch (NumberFormatException e) {
                            player.sendMessage(MessagesUtil.invalidAmountSpecified);
                            return true;
                        }
                        for (Player reciever : Bukkit.getServer().getOnlinePlayers()) {
                            commandUtil.tierRetriver(player, reciever, tier, amount);
                        }
                        return true;
                    }
                } else {
                    player.sendMessage(MessagesUtil.baseCommand);
                    return true;
                }
            }
        }
        return true;
    }
}
