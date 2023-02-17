package docs.noobcore.com.crouchy;

import org.bukkit.plugin.java.JavaPlugin;

public final class Crouchy extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new CrouchHandler(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
