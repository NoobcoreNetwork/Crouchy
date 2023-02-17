package docs.noobcore.com.crouchy;

import org.bukkit.plugin.java.JavaPlugin;

public final class Crouchy extends JavaPlugin {
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new CrouchHandler(), this);
    }
//test
    public void onDisable() {
    }
}
