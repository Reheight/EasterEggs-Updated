package me.reheight.frootseggs.configuration;

import me.reheight.frootseggs.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ConfigurationUtil {
    Main plugin;
    private File TierI = null;
    private File TierII = null;
    private File TierIII = null;
    private File TierIV = null;
    private File TierV = null;

    public static YamlConfiguration TierIConfig = null;
    public static YamlConfiguration TierIIConfig = null;
    public static YamlConfiguration TierIIIConfig = null;
    public static YamlConfiguration TierIVConfig = null;
    public static YamlConfiguration TierVConfig = null;

    public ConfigurationUtil(Main instance) {
        plugin = instance;
    }

    public void checkDataFolderExists() {
        if (!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdir();
        }
    }

    public void checkTierIExists() {
        TierI = new File(plugin.getDataFolder() + File.separator + "Tier I.yml");
        if (!TierI.exists()) {
            try {
                TierI.createNewFile();

                TierIConfig = YamlConfiguration.loadConfiguration(TierI);

                ArrayList<String> commandsList = new ArrayList<>();
                commandsList.add("/say Success");
                commandsList.add("/say Tier I Easter Egg!");

                TierIConfig.set("Commands", commandsList);

                ArrayList<String> loreList = new ArrayList<>();
                loreList.add("&aBroadcast Success");
                loreList.add("&aBroadcast Tier I Easter Egg!");

                TierIConfig.set("Rewards", loreList);

                TierIConfig.save(TierI);

                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        TierIConfig = YamlConfiguration.loadConfiguration(TierI);
        return;
    }

    public void checkTierIIExists() {
        TierII = new File(plugin.getDataFolder() + File.separator + "Tier II.yml");
        if (!TierII.exists()) {
            try {
                TierII.createNewFile();

                TierIIConfig = YamlConfiguration.loadConfiguration(TierII);

                ArrayList<String> commandsList = new ArrayList<>();
                commandsList.add("/say Success");
                commandsList.add("/say Tier II Easter Egg!");

                TierIIConfig.set("Commands", commandsList);

                ArrayList<String> loreList = new ArrayList<>();
                loreList.add("&aBroadcast Success");
                loreList.add("&aBroadcast Tier II Easter Egg!");

                TierIIConfig.set("Rewards", loreList);

                TierIIConfig.save(TierII);

                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        TierIIConfig = YamlConfiguration.loadConfiguration(TierII);
        return;
    }

    public void checkTierIIIExists() {
        TierIII = new File(plugin.getDataFolder() + File.separator + "Tier III.yml");
        if (!TierIII.exists()) {
            try {
                TierIII.createNewFile();

                TierIIIConfig = YamlConfiguration.loadConfiguration(TierIII);

                ArrayList<String> commandsList = new ArrayList<>();
                commandsList.add("/say Success");
                commandsList.add("/say Tier III Easter Egg!");

                TierIIIConfig.set("Commands", commandsList);

                ArrayList<String> loreList = new ArrayList<>();
                loreList.add("&aBroadcast Success");
                loreList.add("&aBroadcast Tier III Easter Egg!");

                TierIIIConfig.set("Rewards", loreList);

                TierIIIConfig.save(TierIII);

                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        TierIIIConfig = YamlConfiguration.loadConfiguration(TierIII);
        return;
    }

    public void checkTierIVExists() {
        TierIV = new File(plugin.getDataFolder() + File.separator + "Tier IV.yml");
        if (!TierIV.exists()) {
            try {
                TierIV.createNewFile();

                TierIVConfig = YamlConfiguration.loadConfiguration(TierIV);

                ArrayList<String> commandsList = new ArrayList<>();
                commandsList.add("/say Success");
                commandsList.add("/say Tier IV Easter Egg!");

                TierIVConfig.set("Commands", commandsList);

                ArrayList<String> loreList = new ArrayList<>();
                loreList.add("&aBroadcast Success");
                loreList.add("&aBroadcast Tier IV Easter Egg!");

                TierIVConfig.set("Rewards", loreList);

                TierIVConfig.save(TierIV);

                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        TierIVConfig = YamlConfiguration.loadConfiguration(TierIV);
        return;
    }

    public void checkTierVExists() {
        TierV = new File(plugin.getDataFolder() + File.separator + "Tier V.yml");
        if (!TierV.exists()) {
            try {
                TierV.createNewFile();

                TierVConfig = YamlConfiguration.loadConfiguration(TierV);

                ArrayList<String> commandsList = new ArrayList<>();
                commandsList.add("/say Success");
                commandsList.add("/say Tier V Easter Egg!");

                TierVConfig.set("Commands", commandsList);

                ArrayList<String> loreList = new ArrayList<>();
                loreList.add("&aBroadcast Success");
                loreList.add("&aBroadcast Tier V Easter Egg!");

                TierVConfig.set("Rewards", loreList);

                TierVConfig.save(TierV);

                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        TierVConfig = YamlConfiguration.loadConfiguration(TierV);
        return;
    }
}
