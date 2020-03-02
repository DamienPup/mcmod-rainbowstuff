package damien.rainbowstuff.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.AbstractHorse;

public class EntityUnicorn extends EntityHorse {

	public EntityUnicorn(World worldIn) 
	{
		super(worldIn);
		this.setSize(1.3964844F, 1.6F);
	}
	
	@Override
	protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.2D));
        this.tasks.addTask(1, new EntityAIRunAroundLikeCrazy(this, 1.2D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D, AbstractHorse.class));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 0.7D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 30.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
    }
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable)
    {
        return new EntityUnicorn(world);
    }
}
