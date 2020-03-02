package damien.rainbowstuff.block.gui;

import damien.rainbowstuff.RainbowStuff;
import damien.rainbowstuff.block.container.ContainerRainbowChest;
import damien.rainbowstuff.block.tileentity.TileEntityRainbowChest;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiRainbowChest extends GuiContainer {
	private static final ResourceLocation GUI_CHEST = new ResourceLocation(RainbowStuff.MODID + ":textures/gui/rainbow_chest.png");
	private final InventoryPlayer playerInventory;
	private final TileEntityRainbowChest te;
	
	public GuiRainbowChest(InventoryPlayer playerInv, TileEntityRainbowChest chestInventory, EntityPlayer player) {
		super(new ContainerRainbowChest(playerInv, chestInventory, player));
		this.playerInventory = playerInv;
		this.te = chestInventory;
		
		this.xSize = 175;
		this.ySize = 256;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		this.fontRenderer.drawString(this.te.getDisplayName().getUnformattedText(), 7, 6, 0);
		this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 7, this.ySize - 92, 0);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(GUI_CHEST);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
}
