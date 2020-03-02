package damien.rainbowstuff.block;

import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.block.tileentity.TileEntityRainbowChest;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockRainbowChest extends BlockContainer {
	public static final AxisAlignedBB CHEST_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.875D, 0.9375D);
	
	public BlockRainbowChest() {
		super(Material.IRON);
		setHardness(3.0F);
		setResistance(20.0F);
		setSoundType(SoundType.WOOD);
		setLightLevel(0);
		setLightOpacity(0);
		setCreativeTab(RainbowStuff.RAINBOW_TAB);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) {
			playerIn.openGui(RainbowStuff.instance, RainbowStuff.GUI_IDS.RAINBOW_CHEST.ordinal(), worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		
		return true;
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntityRainbowChest tileEntity = (TileEntityRainbowChest)worldIn.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(worldIn, pos, tileEntity);
		super.breakBlock(worldIn, pos, state);
	}
	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
			ItemStack stack) {
		if(stack.hasDisplayName()) {
			TileEntity tileEntity = worldIn.getTileEntity(pos);
			if(tileEntity instanceof TileEntityRainbowChest) {
				((TileEntityRainbowChest)tileEntity).setCustomName(stack.getDisplayName());
			}
		}
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityRainbowChest();
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return CHEST_AABB;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return this.getBoundingBox(blockState, worldIn, pos);
	}
}
