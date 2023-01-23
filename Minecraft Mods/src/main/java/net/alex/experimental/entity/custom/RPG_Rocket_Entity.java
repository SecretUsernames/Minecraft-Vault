package net.alex.experimental.entity.custom;

import net.alex.experimental.Experimental;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RPG_Rocket_Entity extends AbstractArrow {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Experimental.MOD_ID);
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
    public static final float explosionDistance = 4F;

    public RPG_Rocket_Entity(EntityType<RPG_Rocket_Entity> entityType, Level world) {
        super(entityType, world);
    }

    public RPG_Rocket_Entity(EntityType<RPG_Rocket_Entity> entityType, double x, double y, double z, Level world) {
        super(entityType, x, y, z, world);
    }

    public RPG_Rocket_Entity(EntityType<RPG_Rocket_Entity> entityType, LivingEntity shooter, Level world) {
        super(entityType, shooter, world);
    }

    @Override
    protected void onHitEntity(EntityHitResult ray) {
        super.onHitEntity(ray);
        Explosion.BlockInteraction explosion$blockinteraction = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.level, this) ? Explosion.BlockInteraction.DESTROY : Explosion.BlockInteraction.NONE;

        this.level.explode(this, this.getX(), this.getY(), this.getZ(), explosionDistance, false, explosion$blockinteraction);
    }

    @Override
    protected void onHitBlock(BlockHitResult ray) {
        super.onHitBlock(ray);
        BlockState theBlockYouHit = this.level.getBlockState(ray.getBlockPos());
    }

    @Override
    protected void tickDespawn() {
        if (this.inGroundTime > 0){
            Explosion.BlockInteraction explosion$blockinteraction = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.level, this) ? Explosion.BlockInteraction.DESTROY : Explosion.BlockInteraction.NONE;

            this.level.explode(this, this.getX(), this.getY(), this.getZ(), explosionDistance, false, explosion$blockinteraction);
            this.discard();
        }
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }
}
