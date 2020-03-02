package damien.rainbowstuff.block;

import damien.rainbowstuff.RainbowStuff;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockRainbowBlock extends Block{
	public BlockRainbowBlock() {
		super(Material.IRON);
		setHardness(4.0F);
		setResistance(20.0F);
		setSoundType(SoundType.STONE);
		setLightLevel(16 / 16F);
		setLightOpacity(5);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(RainbowStuff.RAINBOW_TAB);
	}
}
