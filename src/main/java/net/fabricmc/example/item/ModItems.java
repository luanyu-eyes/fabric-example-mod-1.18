package net.fabricmc.example.item;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.example.item.custom.TestItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static Item TEST_ITEM = registerItem("test_item",new Item(
            new FabricItemSettings().group(ItemGroup.MISC)));
    public static Item TEST_MESSAGE_ITEM = registerItem("test_massage_item",new TestItem(
            new FabricItemSettings().group(ItemGroup.MISC)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM,new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void registerModItems(){

    }
}
