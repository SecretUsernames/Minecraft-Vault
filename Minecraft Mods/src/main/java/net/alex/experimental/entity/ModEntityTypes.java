package net.alex.experimental.entity;

import net.alex.experimental.Experimental;
import net.alex.experimental.entity.custom.RPG_Rocket_Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Experimental.MOD_ID);
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

    public static final RegistryObject<EntityType<RPG_Rocket_Entity>> RPG_ROCKET = ENTITY_TYPES.register("rpg_rocket",
            () -> EntityType.Builder.of((EntityType.EntityFactory<RPG_Rocket_Entity>) RPG_Rocket_Entity::new, MobCategory.MISC).sized(0.5F, 0.5F).build("rpg_rocket"));


}
