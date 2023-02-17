package docs.noobcore.com.crouchy;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import java.lang.reflect.GenericDeclaration;

public class CrouchHandler implements Listener {
    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Block block = player.getLocation().add(0, -1, 0).getBlock().getRelative(BlockFace.UP);

        if (!player.isSneaking()) {
            System.out.println("You stopped sneaking! youre now visible");
            return;
        }

        if (block.getType() == Material.TALL_GRASS) {
            System.out.println("You are sneaking in tall grass, you are invisible");
            System.out.println("will make invisible here");
        }
            else
            System.out.println("you walked out of grass while sneaking, sneaky boi, you're visible");


            }
        }





