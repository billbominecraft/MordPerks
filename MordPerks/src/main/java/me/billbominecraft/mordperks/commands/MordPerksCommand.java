package me.billbominecraft.mordperks.commands;

import me.billbominecraft.mordperks.items.Util;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class MordPerksCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String tag = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "MordPerks" + ChatColor.DARK_GRAY + "]";
        String textvault = tag + ChatColor.WHITE + " Rank vault is now opening...";

        if(sender instanceof Player){

            Player player = (Player) sender;
            Inventory itemvault = Bukkit.createInventory(player, 18, "MordPerks Vault");

            if(player.hasPermission("mordperks.access")){

                if(args.length == 1){

                    String ranks = args[0];

                    switch(ranks){

                        case "military":
                            itemvault.setItem(0, Util.Footmanitem());
                            itemvault.setItem(1, Util.Squireitem());
                            itemvault.setItem(2, Util.Knightitem());
                            itemvault.setItem(3, Util.Royalguard1item());
                            itemvault.setItem(4, Util.Royalguard2item());
                            itemvault.setItem(5, Util.Beserker1item());
                            itemvault.setItem(6, Util.Beserker2item());
                            itemvault.setItem(7, Util.Archer1item());
                            itemvault.setItem(8, Util.Archer2item());
                            itemvault.setItem(9, Util.Commanderitem());
                            itemvault.setItem(10, Util.Moleitem());
                            itemvault.setItem(11, Util.Agentitem());
                            itemvault.setItem(12, Util.HussarSword());
                            itemvault.setItem(13, Util.HussarAxe());
                            itemvault.setItem(14, Util.HussarBow());
                            itemvault.setItem(15, Util.CuirassierChest());
                            itemvault.setItem(16, Util.CuirassierPants());
                            player.sendMessage(textvault);
                            player.openInventory(itemvault);
                            break;

                        case "religious":
                            itemvault.setItem(0, Util.ReligionHat());
                            itemvault.setItem(1, Util.ReligionChest());
                            itemvault.setItem(2, Util.ReligionPants());
                            itemvault.setItem(3, Util.ReligionBoots());
                            player.sendMessage(textvault);
                            player.openInventory(itemvault);
                            break;

                        case "fishing":
                            itemvault.setItem(0, Util.FishingHat());
                            itemvault.setItem(1, Util.FishingRod());
                            player.sendMessage(textvault);
                            player.openInventory(itemvault);
                            break;

                        case "hunter":
                            itemvault.setItem(0, Util.HuntingChest());
                            itemvault.setItem(1, Util.HuntingBow());
                            player.sendMessage(textvault);
                            player.openInventory(itemvault);
                            break;

                        case "mining":
                            itemvault.setItem(0, Util.MinerPick1());
                            itemvault.setItem(1, Util.MinerPick2());
                            player.sendMessage(textvault);
                            player.openInventory(itemvault);
                            break;

                        case "noble":
                            itemvault.setItem(0, Util.NobleChest());
                            player.sendMessage(textvault);
                            player.openInventory(itemvault);
                            break;

                        default:
                            player.sendMessage(tag + ChatColor.RED + " Please enter a valid rank type...");
                            break;
                    }


                }else{

                    player.sendMessage(tag + ChatColor.RED + " You need to add an appropriate argument to this command.");

                }

            }else{

                player.sendMessage(tag + ChatColor.RED + " You do not have permission to execute this command.");

            }

        }else{

            System.out.println("You need to be a player to execute this command.");

        }

        return true;

    }

}
