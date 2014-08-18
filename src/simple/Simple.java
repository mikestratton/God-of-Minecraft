/***
 * Excerpted from "Learn to Program with Minecraft Plugins",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/ahmine for more book information.
***/
package simple;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;//(1)
import org.bukkit.Sound;
import org.bukkit.entity.*; // spawn animals!
import org.bukkit.Location;

public class Simple extends JavaPlugin {
  public static Logger log = Logger.getLogger("Minecraft");
  public void onEnable() {
    log.info("[Simple] Start up.");
  }
  public void onReload() {
    log.info("[Simple] Server reloaded.");
  }
  public void onDisable() {
    log.info("[Simple] Server stopping.");
  }
  public boolean onCommand(CommandSender sender, Command command, 
                           String commandLabel, String[] args) {         
    if (commandLabel.equalsIgnoreCase("simple")) {
      if (sender instanceof Player) { 
        Player me = (Player)sender;
        // Put your code after this line:
        //(2)
        float volume = 12.6f;
        float pitch = 1.0f;
        me.sendMessage("GOD OF MINECRAFT SAID: 'LET THERE BE LIFE'");
        me.playSound(me.getLocation(), Sound.EXPLODE, volume, pitch);
        
        //spawn passive mobs!!!!!
        Player player = (Player) sender;
        Location loc = player.getLocation();
        loc.setX(loc.getX() + 20); // INCREASE DISTANCE FROM PLAYER
        Firework firework = player.getWorld().spawn(loc, Firework.class);
        
        for (int i=1; i<25; i++){ // GOD CREATES LIFE! 225 CREATURES!!!!! BOOM!
         Horse horse = player.getWorld().spawn(loc, Horse.class);
         Chicken chicken = player.getWorld().spawn(loc, Chicken.class);
         Cow cow = player.getWorld().spawn(loc, Cow.class);
         Pig pig = player.getWorld().spawn(loc, Pig.class);
         Wolf wolf = player.getWorld().spawn(loc, Wolf.class);
         Ocelot cat = player.getWorld().spawn(loc, Ocelot.class);
         Sheep sheep = player.getWorld().spawn(loc, Sheep.class);
         Bat bat = player.getWorld().spawn(loc, Bat.class);
         Villager villager = player.getWorld().spawn(loc, Villager.class);
         
        } //endfor
        
        return true;
        }//endif
    }//endif
    return false;
  }//endPublicBoolean
}//endPublicClassSimple
