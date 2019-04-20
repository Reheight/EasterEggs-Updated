package me.reheight.frootseggs.events;

import me.reheight.frootseggs.items.ItemUtil;
import me.reheight.frootseggs.messages.MessagesUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class CommandUtil implements Listener {
    private ItemUtil itemUtil = new ItemUtil();
    public void noPermissions(CommandSender sender) {
        if (sender instanceof Player) {
            sender.sendMessage(MessagesUtil.noPermission);
        }
        return;
    }
    public void eggTooLessArguments(CommandSender sender) {
        if (sender instanceof Player) {
            sender.sendMessage(MessagesUtil.tooLessArguments);
        }
        return;
    }

    public void tierRetriver (CommandSender sender, Player reciever, int tier, int amount) {
        if (tier == 1) {
            itemUtil.giveTierI(sender, reciever, amount);
            return;
        } else if (tier == 2) {
            itemUtil.giveTierII(sender, reciever, amount);
            return;
        } else if (tier == 3) {
            itemUtil.giveTierIII(sender, reciever, amount);
            return;
        } else if (tier == 4) {
            itemUtil.giveTierIV(sender, reciever, amount);
            return;
        } else if (tier == 5) {
            itemUtil.giveTierV(sender, reciever, amount);
            return;
        } else {
            if (sender instanceof Player) {
                sender.sendMessage(MessagesUtil.noTierExists);
            }
            return;
        }
    }

    public void giveEgg(Player sender, Player reciever, int tier ,int amount) {
        if (!sender.hasPermission("frootsegg.give")) {
            noPermissions(sender);
            return;
        }

        this.tierRetriver(sender, reciever, tier, amount);
    }

    public void giveAllEgg(CommandSender sender, int tier, int amount) {
        for (Player reciever : Bukkit.getServer().getOnlinePlayers()) {
            if (tier == 1) {
                itemUtil.giveTierI(sender, reciever, amount);
                return;
            } else if (tier == 2) {
                itemUtil.giveTierII(sender, reciever, amount);
                return;
            } else if (tier == 3) {
                itemUtil.giveTierIII(sender, reciever, amount);
                return;
            } else if (tier == 4) {
                itemUtil.giveTierIV(sender, reciever, amount);
                return;
            } else if (tier == 5) {
                itemUtil.giveTierV(sender, reciever, amount);
                return;
            } else {
                if (sender instanceof Player) {
                    sender.sendMessage(MessagesUtil.noTierExists);
                }
                return;
            }
        }
    }
}
