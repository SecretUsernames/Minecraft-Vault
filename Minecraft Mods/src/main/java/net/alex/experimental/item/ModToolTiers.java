package net.alex.experimental.item;

import net.alex.experimental.Experimental;
import net.alex.experimental.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    //Creates Tier STEEL
    public static Tier STEEL;
    static {
        STEEL = TierSortingRegistry.registerTier(
                //          Mining Level, Default Uses, Speed, AttackBonus, Enchantability
                new ForgeTier(2, 800, 7f, 2.5f, 12,
                        //New Tag from ModTags                          Repair Ingredient:
                        ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get())), //dont worry about this for steel, no ore
                new ResourceLocation(Experimental.MOD_ID, "steel"), List.of(Tiers.IRON), List.of());
    }


}
