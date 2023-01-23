package net.alex.experimental.client.render;

import net.alex.experimental.Experimental;
import net.alex.experimental.entity.custom.RPG_Rocket_Entity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RPG_Rocket_Renderer extends ArrowRenderer<RPG_Rocket_Entity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Experimental.MOD_ID, "textures/entity/rpg_rocket.png");

    public RPG_Rocket_Renderer(EntityRendererProvider.Context manager) {
        super(manager);
    }

    public ResourceLocation getTextureLocation(RPG_Rocket_Entity arrow) {
        return TEXTURE;
    }
}
