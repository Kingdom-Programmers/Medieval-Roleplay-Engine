package rpsystem.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import rpsystem.CharacterCard;

import java.util.ArrayList;

public class CardCommand {

    public static void showCard(CommandSender sender, String[] args, ArrayList<CharacterCard> cards) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            for (CharacterCard card : cards) {

                if (card.getPlayerName().equalsIgnoreCase(player.getName())) {

                    player.sendMessage(ChatColor.AQUA + "Name: " + card.getName());
                    player.sendMessage(ChatColor.AQUA + "Race: " + card.getRace());
                    player.sendMessage(ChatColor.AQUA + "Subculture: " + card.getSubculture());
                    player.sendMessage(ChatColor.AQUA + "Subculture: " + card.getSubculture());
                    player.sendMessage(ChatColor.AQUA + "Age: " + card.getAge());
                    player.sendMessage(ChatColor.AQUA + "Gender: " + card.getGender());
                    player.sendMessage(ChatColor.AQUA + "Religion: " + card.getReligion());
                }
            }
        }
    }

    public static void changeName(CommandSender sender, String[] args, ArrayList<CharacterCard> cards) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            for (CharacterCard card : cards) {

                if (card.getPlayerName().equalsIgnoreCase(player.getName())) {

                    if (args.length > 1) {
                        card.setName(args[1]);
                        player.sendMessage(ChatColor.GREEN + "Name set! Type /card to see changes.");
                    }
                    else {
                        player.sendMessage(ChatColor.RED + "Usage: /card name (character-name)");
                    }

                }
            }
        }
    }

    public static void changeRace(CommandSender sender, String[] args, ArrayList<CharacterCard> cards) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            for (CharacterCard card : cards) {

                if (card.getPlayerName().equalsIgnoreCase(player.getName())) {

                    if (args.length > 1) {
                        card.setRace(args[1]);
                        player.sendMessage(ChatColor.GREEN + "Race set! Type /card to see changes.");
                    }
                    else {
                        player.sendMessage(ChatColor.RED + "Usage: /card race (character-race)");
                    }
                }
            }
        }
    }

    public static void changeSubculture(CommandSender sender, String[] args, ArrayList<CharacterCard> cards) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            for (CharacterCard card : cards) {

                if (card.getPlayerName().equalsIgnoreCase(player.getName())) {

                    if (args.length > 1) {
                        card.setSubculture(args[1]);
                        player.sendMessage(ChatColor.GREEN + "Subculture set! Type /card to see changes.");
                    }
                    else {
                        player.sendMessage(ChatColor.RED + "Usage: /card subculture (character-subculture)");
                    }
                }
            }
        }
    }

    public static void changeReligion(CommandSender sender, String[] args, ArrayList<CharacterCard> cards) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            for (CharacterCard card : cards) {

                if (card.getPlayerName().equalsIgnoreCase(player.getName())) {

                    if (args.length > 1) {
                        card.setReligion(args[1]);
                        player.sendMessage(ChatColor.GREEN + "Religion set! Type /card to see changes.");
                    }
                    else {
                        player.sendMessage(ChatColor.RED + "Usage: /card religion (character-religion)");
                    }
                }
            }
        }
    }

    public static void changeAge(CommandSender sender, String[] args, ArrayList<CharacterCard> cards) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            for (CharacterCard card : cards) {

                if (card.getPlayerName().equalsIgnoreCase(player.getName())) {

                    if (args.length > 1) {
                        card.setAge(Integer.parseInt(args[1]));
                        player.sendMessage(ChatColor.GREEN + "Age set! Type /card to see changes.");
                    }
                    else {
                        player.sendMessage(ChatColor.RED + "Usage: /card age (character-age)");
                    }
                }
            }
        }
    }

    public static void changeGender(CommandSender sender, String[] args, ArrayList<CharacterCard> cards) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            for (CharacterCard card : cards) {

                if (card.getPlayerName().equalsIgnoreCase(player.getName())) {

                    if (args.length > 1) {
                        card.setGender(args[1]);
                        player.sendMessage(ChatColor.GREEN + "Gender set! Type /card to see changes.");
                    }
                    else {
                        player.sendMessage(ChatColor.RED + "Usage: /card gender (character-gender)");
                    }
                }
            }
        }
    }

    public static void showPlayerInfo(CommandSender sender, String[] args, ArrayList<CharacterCard> cards) {
        for (CharacterCard card : cards) {
            if (args.length > 0) {
                if (card.getPlayerName().equals(args[0])) {
                    sender.sendMessage(ChatColor.AQUA + "Name: " + card.getName());
                    sender.sendMessage(ChatColor.AQUA + "Race: " + card.getRace());
                    sender.sendMessage(ChatColor.AQUA + "Subculture: " + card.getSubculture());
                    sender.sendMessage(ChatColor.AQUA + "Age: " + card.getAge());
                    sender.sendMessage(ChatColor.AQUA + "Gender: " + card.getGender());
                    sender.sendMessage(ChatColor.AQUA + "Religion: " + card.getReligion());
                    return;
                }
            }
        }
    }

}
