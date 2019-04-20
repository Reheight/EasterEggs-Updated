package me.reheight.frootseggs;

import me.reheight.frootseggs.commands.BaseCommand;
import me.reheight.frootseggs.configuration.ConfigurationUtil;
import me.reheight.frootseggs.events.EggInteractUtil;
import me.reheight.frootseggs.events.InventoryUtil;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private BaseCommand baseCommand = new BaseCommand(this);
    private ConfigurationUtil configurationUtil = new ConfigurationUtil(this);
    private EggInteractUtil eggInteractionEvent = new EggInteractUtil(this);
    private InventoryUtil inventoryUtil = new InventoryUtil();

    @Override
    public void onEnable() {
        getLogger().info("Initialization successful!");

        PluginManager pluginManager = getServer().getPluginManager();

        configurationUtil.checkDataFolderExists();
        configurationUtil.checkTierIExists();
        configurationUtil.checkTierIIExists();
        configurationUtil.checkTierIIIExists();
        configurationUtil.checkTierIVExists();
        configurationUtil.checkTierVExists();

        pluginManager.registerEvents(eggInteractionEvent, this);
        pluginManager.registerEvents(inventoryUtil,this);

        getCommand("frootseggs").setExecutor(baseCommand);
    }

    @Override
    public void onDisable() {
        getLogger().info("Deinitialization successful!");
    }
}
