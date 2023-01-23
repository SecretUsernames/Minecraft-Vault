package net.alex.experimental.item.custom;

import net.alex.experimental.client.render.RPG_Rocket_Renderer;
import net.alex.experimental.entity.ModEntityTypes;
import net.alex.experimental.entity.custom.RPG_Rocket_Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Weapon extends Item {

    public Weapon(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        float f1 = 0.0F;
        float f2 = 3.5F; //Speed
        float f3 = 1.5F; //Accuracy Fault
        RPG_Rocket_Entity RPG = new RPG_Rocket_Entity(ModEntityTypes.RPG_ROCKET.get(), player, level);
        RPG.shootFromRotation(player, player.getXRot(), player.getYRot(), f1, f2, f3);

        level.addFreshEntity(RPG);
        return super.use(level, player, hand);
    }
}
