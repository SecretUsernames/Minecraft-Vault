package net.alex.experimental.util;

import net.alex.experimental.Experimental;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    //Blocks Tags
    public static class Blocks {
        //Tier
        public static final TagKey<Block> NEEDS_STEEL_TOOL = tag("needs_steel_tool");

        //Helper Methods
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Experimental.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }
}