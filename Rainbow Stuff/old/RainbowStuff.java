package damien.rainbowstuff;

import org.apache.logging.log4j.Logger;

import damien.rainbowstuff.init.ModEntities;
import damien.rainbowstuff.recipes.ModRecipes;
import damien.rainbowstuff.tabs.RainbowTab;
import damien.rainbowstuff.world.gen.RainbowWorldGen;

import org.apache.logging.log4j.LogManager;

import net.minecraft.client.main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = RainbowStuff.MODID, name = RainbowStuff.NAME, version = RainbowStuff.VERSION, acceptedMinecraftVersions = RainbowStuff.MC_VERSION)
public class RainbowStuff {
	@Instance
	public static Main instance;
	public static final String MODID = "rainbowstuff";
	public static final String NAME = "Rainbow Stuff";
	public static final String VERSION = "1.0.0";
	public static final String MC_VERSION = "[1.12.2]";
	public static final CreativeTabs RAINBOW_TAB = new RainbowTab();
	public static final int ENTITY_UNICORN_ID = 1;

	public static final Logger LOGGER = LogManager.getLogger(RainbowStuff.MODID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModEntities.registerEntities();
		ModEntities.registerEntityRenders();
        LOGGER.info(NAME + " PreInit Completed.");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.initSmelting();
		GameRegistry.registerWorldGenerator(new RainbowWorldGen(), 0);
		LOGGER.info(NAME + " Init Completed.");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LOGGER.info(NAME + " PostInit Completed.");
	}

}
