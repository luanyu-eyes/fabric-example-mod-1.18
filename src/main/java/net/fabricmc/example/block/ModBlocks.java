package net.fabricmc.example.block;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.example.block.custom.*;
import net.fabricmc.example.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()),ItemGroup.MISC);
    public static final Block TEST_MESSAGE_BLOCK = registerBlock("test_message_block",
            new TestBlock(FabricBlockSettings.of(Material.METAL).strength(2f)), ModItemGroup.TEST_GROUP);

    public static final Block MY_BUTTON = registerBlock("my_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f)
                .requiresTool().noCollision()), ModItemGroup.TEST_GROUP);
    public static final Block MY_PRESSURE = registerBlock("my_pressure",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.of(Material.METAL).strength(3.0f)
                    .requiresTool().noCollision()), ModItemGroup.TEST_GROUP);
    public static final Block MY_FENCE = registerBlock("my_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f)
                    .requiresTool()), ModItemGroup.TEST_GROUP);
    public static final Block MY_FENCE_GATE = registerBlock("my_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f)
                    .requiresTool()), ModItemGroup.TEST_GROUP);
    public static final Block MY_WALL = registerBlock("my_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f)
                    .requiresTool()), ModItemGroup.TEST_GROUP);
    public static final Block MY_SLAB = registerBlock("my_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f)
                    .requiresTool()), ModItemGroup.TEST_GROUP);
    public static final Block MY_STAIRS = registerBlock("my_stairs",
            new ModStairsBlock(ModBlocks.TEST_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(3.0f)
                    .requiresTool()), ModItemGroup.TEST_GROUP);
    public static final Block MY_DOOR = registerBlock("my_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f)
                    .requiresTool().nonOpaque()), ModItemGroup.TEST_GROUP);
    public static final Block MY_TRAPDOOR = registerBlock("my_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f)
                    .requiresTool().nonOpaque()), ModItemGroup.TEST_GROUP);
    public static final Block MY_FLOWER = registerBlock("my_flower",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE,12,
                    FabricBlockSettings.copy(Blocks.DANDELION).strength(4f)
                            .noCollision().nonOpaque()),ModItemGroup.TEST_GROUP);
    public static final Block MY_POTTED_FLOWER = registerBlockWithoutBlockItem("my_potted_flower",
            new FlowerPotBlock(ModBlocks.MY_FLOWER,
                    FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque()));
    public static final Block MY_LAMP = registerBlock("my_lamp",
            new ModLampBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f).requiresTool()
                    .luminance((state) -> state.get(ModLampBlock.CLICKED)?15:0)),ModItemGroup.TEST_GROUP);
    public static final Block MY_WINDOW = registerBlock("my_window",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(3f)
                            .nonOpaque()),ModItemGroup.TEST_GROUP);

    public static Block registerBlock(String name,Block block,ItemGroup group){
        registerBlockItem(name,block,group);
        return Registry.register(Registry.BLOCK,new Identifier(ExampleMod.MOD_ID,name),
                block);
    }
    public static Block registerBlockWithoutBlockItem(String name,Block block){
        return Registry.register(Registry.BLOCK,new Identifier(ExampleMod.MOD_ID,name),
                block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){

    }
}
