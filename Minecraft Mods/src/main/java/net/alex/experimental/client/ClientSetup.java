package net.alex.experimental.client;

import net.alex.experimental.Experimental;
import net.alex.experimental.client.render.RPG_Rocket_Renderer;
import net.alex.experimental.entity.ModEntityTypes;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Experimental.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public class ClientSetup {
        @SubscribeEvent
        public static void doSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntityTypes.RPG_ROCKET.get(), RPG_Rocket_Renderer::new);
        }
    }

