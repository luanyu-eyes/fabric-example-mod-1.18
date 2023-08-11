package net.fabricmc.example.item;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TEST_GROUP = FabricItemGroupBuilder.build(
            new Identifier(ExampleMod.MOD_ID,"test_group"),() -> new ItemStack(ModItems.TEST_ITEM));
}
