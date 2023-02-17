package docs.noobcore.com.crouchy;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CrouchHandler implements Listener {
    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Block block = player.getLocation().add(0.0, -1.0, 0.0).getBlock().getRelative(BlockFace.UP);
        if (!player.isSneaking()) {
            System.out.println("You stopped sneaking! youre now visible");
            player.removePotionEffect(PotionEffectType.INVISIBILITY);
        } else {
            if (block.getType() == Material.TALL_GRASS) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999, 2, false));
            } else {
                player.removePotionEffect(PotionEffectType.INVISIBILITY);
            }

        }
    }
}







