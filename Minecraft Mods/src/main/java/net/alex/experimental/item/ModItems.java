package net.alex.experimental.item;

import net.alex.experimental.Experimental;
import net.alex.experimental.item.custom.Weapon;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Experimental.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    //----------------------------------------CRAFTING PIECES---------------------------------------------------------------

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> SWORD_HANDLE = ITEMS.register("sword_handle",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> RAINBOW_BLADE = ITEMS.register("rainbow_blade",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.MOD_TAB)));

    //---------------------------------------------WEAPONS---------------------------------------------------------------

    public static final RegistryObject<Item> STEEL_SWORD_RUBY = ITEMS.register("steel_sword_ruby",
            () -> new SwordItem(ModToolTiers.STEEL, 3, 3f, new SwordItem.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, 3, 3f, new SwordItem.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> STEEL_SWORD_EMERALD = ITEMS.register("steel_sword_emerald",
            () -> new SwordItem(ModToolTiers.STEEL, 3, 3f, new SwordItem.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> STEEL_SWORD_SAPPHIRE = ITEMS.register("steel_sword_sapphire",
            () -> new SwordItem(ModToolTiers.STEEL, 3, 3f, new SwordItem.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> RAINBOW_SWORD = ITEMS.register("rainbow_sword",
            () -> new SwordItem(ModToolTiers.STEEL, 3, 3f, new SwordItem.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> RPG = ITEMS.register("rpg",
            () -> new Weapon(new Item.Properties().tab(ModCreativeModTab.MOD_TAB)));

    //----------------------------------------------ARMOR--------------------------------------------------------------

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.MOD_TAB)));

    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.MOD_TAB)));

}
