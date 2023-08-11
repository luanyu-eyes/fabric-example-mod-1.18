package net.fabricmc.example.item;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.example.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TEST_ITEM = registerItem("test_item",new Item(
            new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item TEST_MESSAGE_ITEM = registerItem("test_massage_item",new TestItem(
            new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item MY_SWORD = registerItem("my_sword",
            new ModSlownessSwordItem(ModToolMaterials.TEST, 3, 3f,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static final Item MY_Axe= registerItem("my_axe",
            new ModAxeItem(ModToolMaterials.TEST, 6, 1f,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static final Item MY_HOE= registerItem("my_hoe",
            new ModHoeItem(ModToolMaterials.TEST, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static final Item MY_SHOVEL = registerItem("my_shovel",
            new ShovelItem(ModToolMaterials.TEST, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static final Item MY_PICKAXE = registerItem("my_pickaxe",
            new ModPickAxeItem(ModToolMaterials.TEST, 2, 0f,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static final Item MY_HELMET = registerItem("my_helmet",
            new ArmorItem(ModArmorMaterials.TEST, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static final Item MY_CHESTPLATE= registerItem("my_chestplate",
            new ArmorItem(ModArmorMaterials.TEST, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static final Item MY_LEGGINGS = registerItem("my_leggings",
            new ArmorItem(ModArmorMaterials.TEST, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static final Item MY_BOOTS = registerItem("my_boots",
            new ArmorItem(ModArmorMaterials.TEST, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM,new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void registerModItems(){

    }
}
