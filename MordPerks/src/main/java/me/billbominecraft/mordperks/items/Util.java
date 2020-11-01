package me.billbominecraft.mordperks.items;

import me.billbominecraft.mordperks.MordPerks;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class Util {

    public static ItemStack Footmanitem() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("footman.protection-level"), true);
        meta.addEnchant(Enchantment.THORNS, plugin.getConfig().getInt("footman.thorns-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("footman.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("footman.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("footman.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("footman.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack Squireitem() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("squire.protection-level"), true);
        meta.addEnchant(Enchantment.THORNS, plugin.getConfig().getInt("squire.thorns-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("squire.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("squire.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("squire.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("squire.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack Knightitem() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.THORNS, plugin.getConfig().getInt("knight.thorns-level"), true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("knight.protection-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("knight.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("knight.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("knight.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("knight.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack Royalguard1item() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.KNOCKBACK, plugin.getConfig().getInt("royal-guard1.knockback-level"), true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, plugin.getConfig().getInt("royal-guard1.looting-level"), true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, plugin.getConfig().getInt("royal-guard1.sharpness-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("royal-guard1.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("royal-guard1.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("royal-guard1.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("royal-guard1.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack Royalguard2item() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.FIRE_ASPECT, plugin.getConfig().getInt("royal-guard2.fireaspect-level"), true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, plugin.getConfig().getInt("royal-guard2.looting-level"), true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, plugin.getConfig().getInt("royal-guard2.sharpness-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("royal-guard2.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("royal-guard2.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("royal-guard2.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("royal-guard2.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack Beserker1item() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.KNOCKBACK, plugin.getConfig().getInt("beserker1.knockback-level"), true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, plugin.getConfig().getInt("beserker1.sharpness-level"), true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, plugin.getConfig().getInt("beserker1.looting-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("beserker1.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("beserker1.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("beserker1.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("beserker1.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack Beserker2item() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.FIRE_ASPECT, plugin.getConfig().getInt("beserker2.fireaspect-level"), true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, plugin.getConfig().getInt("beserker2.looting-level"), true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, plugin.getConfig().getInt("beserker2.sharpness-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("beserker2.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("beserker2.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("beserker2.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("beserker2.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack Archer1item() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.BOW);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.ARROW_FIRE, plugin.getConfig().getInt("archer1.flame-level"), true);
        meta.addEnchant(Enchantment.ARROW_DAMAGE, plugin.getConfig().getInt("archer1.power-level"), true);
        meta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        meta.setUnbreakable(plugin.getConfig().getBoolean("archer1.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("archer1.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("archer1.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("archer1.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack Archer2item() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.BOW);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, plugin.getConfig().getInt("archer2.punch-level"), true);
        meta.addEnchant(Enchantment.ARROW_DAMAGE, plugin.getConfig().getInt("archer2.power-level"), true);
        meta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        meta.setUnbreakable(plugin.getConfig().getBoolean("archer2.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("archer2.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("archer2.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("archer2.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack Commanderitem() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("commander.protection-level"), true);
        meta.addEnchant(Enchantment.THORNS, plugin.getConfig().getInt("commander.thorns-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("commander.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("commander.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("commander.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("commander.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack Moleitem() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("mole.protection-level"), true);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, plugin.getConfig().getInt("mole.proj-protection-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("mole.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("mole.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("mole.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("mole.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack Agentitem() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.DEPTH_STRIDER, plugin.getConfig().getInt("agent.strider-level"), true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, plugin.getConfig().getInt("agent.featherfall-level"), true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("agent.protection-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("agent.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("agent.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("agent.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("agent.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack HussarSword() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.FIRE_ASPECT, plugin.getConfig().getInt("hussarsword.fire-level"), true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, plugin.getConfig().getInt("hussarsword.sharpness-level"), true);
        meta.addEnchant(Enchantment.KNOCKBACK, plugin.getConfig().getInt("hussarsword.knockback-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("hussarsword.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hussarsword.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hussarsword.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hussarsword.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack HussarAxe() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.KNOCKBACK, plugin.getConfig().getInt("hussaraxe.knockback-level"), true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, plugin.getConfig().getInt("hussaraxe.fire-level"), true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, plugin.getConfig().getInt("hussaraxe.sharpness-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("hussaraxe.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hussaraxe.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hussaraxe.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hussaraxe.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack HussarBow() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.BOW);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.ARROW_DAMAGE, plugin.getConfig().getInt("hussarbow.power-level"), true);
        meta.addEnchant(Enchantment.ARROW_FIRE, plugin.getConfig().getInt("hussarbow.flame-level"), true);
        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, plugin.getConfig().getInt("hussarbow.punch-level"), true);
        meta.addEnchant(Enchantment.ARROW_INFINITE, 1 ,false);
        meta.setUnbreakable(plugin.getConfig().getBoolean("hussarbow.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hussarbow.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hussarbow.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hussarbow.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack CuirassierChest() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.THORNS, plugin.getConfig().getInt("cuirassierchest.thorns-level"), true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("cuirassierchest.protection-level"), true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, plugin.getConfig().getInt("cuirassierchest.fire-protection-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("cuirassierchest.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("cuirassierchest.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("cuirassierchest.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("cuirassierchest.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack CuirassierPants() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, plugin.getConfig().getInt("cuirassierpants.blast-protection-level"), true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("cuirassierpants.protection-level"), true);
        meta.addEnchant(Enchantment.THORNS, plugin.getConfig().getInt("cuirassierpants.thorns-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("cuirassierpants.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("cuirassierpants.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("cuirassierpants.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("cuirassierpants.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack ReligionHat() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("nun-monk1.protection-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("nun-monk1.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk1.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk1.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk1.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack ReligionChest() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("nun-monk2.protection-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("nun-monk2.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk2.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk2.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk2.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack ReligionPants() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("nun-monk3.protection-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("nun-monk3.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk3.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk3.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk3.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack ReligionBoots() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("nun-monk4.protection-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("nun-monk4.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk4.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk4.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("nun-monk4.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack FishingHat() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.OXYGEN, plugin.getConfig().getInt("fisherman.respiration-level"), true);
        meta.addEnchant(Enchantment.WATER_WORKER, plugin.getConfig().getInt("fisherman.aqua-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("fisherman.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("fisherman.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("fisherman.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("fisherman.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack FishingRod() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.FISHING_ROD);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.LUCK, plugin.getConfig().getInt("angler.luck-level"), true);
        meta.addEnchant(Enchantment.LURE, plugin.getConfig().getInt("angler.lure-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("angler.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("angler.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("angler.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("angler.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack HuntingChest() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.THORNS, plugin.getConfig().getInt("hunter.thorns-level"), true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, plugin.getConfig().getInt("hunter.protection-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("hunter.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hunter.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hunter.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("hunter.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack HuntingBow() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.BOW);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        meta.addEnchant(Enchantment.ARROW_FIRE, plugin.getConfig().getInt("ranger.flame-level"), true);
        meta.addEnchant(Enchantment.ARROW_DAMAGE, plugin.getConfig().getInt("ranger.power-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("ranger.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ranger.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ranger.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("ranger.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack MinerPick1() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.DIG_SPEED, plugin.getConfig().getInt("miner1.efficiency-level"), true);
        meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, plugin.getConfig().getInt("miner1.fortune-level"), true);
        meta.setUnbreakable(plugin.getConfig().getBoolean("miner1.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("miner1.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("miner1.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("miner1.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack MinerPick2() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.DIG_SPEED, plugin.getConfig().getInt("miner2.efficiency-level"), true);
        meta.addEnchant(Enchantment.SILK_TOUCH, 1, false);
        meta.setUnbreakable(plugin.getConfig().getBoolean("miner2.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("miner2.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("miner2.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("miner2.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack NobleChest() {

        Plugin plugin = MordPerks.getPlugin(MordPerks.class);

        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();

        meta.setUnbreakable(plugin.getConfig().getBoolean("lord-lady.unbreakable"));
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("lord-lady.name")));

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("lord-lady.loreline1")));
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("lord-lady.loreline2")));
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

}