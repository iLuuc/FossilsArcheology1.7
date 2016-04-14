package com.github.revival.server.entity.toy;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.github.revival.Revival;
import com.github.revival.server.entity.mob.test.EntityToyBase;
import com.github.revival.server.item.FAItemRegistry;
import com.github.revival.server.message.MessageRollBall;

public class EntityToyBall extends EntityToyBase{

	public int rollValue;

	public EntityToyBall(World world) {
		super(world, 15);
		this.setSize(0.5F, 0.5F);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1);
	}
	
	protected void entityInit(){
		super.entityInit();
		this.dataWatcher.addObject(20, 0);
	}

	public void writeEntityToNBT(NBTTagCompound compound){
		super.writeEntityToNBT(compound);
		compound.setInteger("Color", this.getColor());
	}

	public void readEntityFromNBT(NBTTagCompound compound){
		super.readEntityFromNBT(compound);
		this.setColor(compound.getInteger("Color"));
	}

	public void setColor(int color) {
		this.dataWatcher.updateObject(20, color);
	}

	public int getColor() {
		return this.dataWatcher.getWatchableObjectInt(20);
	}

	public void onUpdate(){
		super.onUpdate();
		if(this.motionX > 0 || this.motionZ < 0 || this.motionZ > 0 || this.motionZ < 0){
			rollValue++;
			Revival.channel.sendToAll(new MessageRollBall(this.getEntityId(), this.rollValue));
		}
	}

	@Override
	protected ItemStack getItem() {
		return new ItemStack(FAItemRegistry.INSTANCE.toyBall, 1, this.getColor());
	}
	
	@Override
	protected String getAttackNoise() {
		return "mob.slime.attack";
	}
}
