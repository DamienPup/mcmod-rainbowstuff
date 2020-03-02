package damien.rainbowstuff.block;

import damien.rainbowstuff.RainbowStuff;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockRainbowOre extends Block {
	public BlockRainbowOre() {
		super(Material.IRON);
		setHardness(5.0F);
		setResistance(15.0F);
		setSoundType(SoundType.STONE);
		setLightLevel(0.0F);
		setLightOpacity(15);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(RainbowStuff.RAINBOW_TAB);
	}

}
