package net.fabricmc.example.item;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.example.item.custom.ModAxeItem;
import net.fabricmc.example.item.custom.ModHoeItem;
import net.fabricmc.example.item.custom.ModPickAxeItem;
import net.fabricmc.example.item.custom.TestItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static Item TEST_ITEM = registerItem("test_item",new Item(
            new FabricItemSettings().group(ItemGroup.MISC)));
    public static Item TEST_MESSAGE_ITEM = registerItem("test_massage_item",new TestItem(
            new FabricItemSettings().group(ItemGroup.MISC)));
    public static Item MY_SWORD = registerItem("my_sword",
            new SwordItem(ModToolMaterials.TEST, 3, 3f,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static Item MY_Axe= registerItem("my_axe",
            new ModAxeItem(ModToolMaterials.TEST, 6, 1f,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static Item MY_HOE= registerItem("my_hoe",
            new ModHoeItem(ModToolMaterials.TEST, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static Item MY_SHOVEL = registerItem("my_shovel",
            new ShovelItem(ModToolMaterials.TEST, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));
    public static Item MY_PICKAXE = registerItem("my_pickaxe",
            new ModPickAxeItem(ModToolMaterials.TEST, 2, 0f,
                    new FabricItemSettings().group(ModItemGroup.TEST_GROUP)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM,new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void registerModItems(){

    }
}
