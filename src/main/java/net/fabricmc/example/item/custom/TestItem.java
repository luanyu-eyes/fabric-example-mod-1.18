package net.fabricmc.example.item.custom;

import net.fabricmc.example.Sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class TestItem extends Item {
    public TestItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        BlockPos positionClicked = context.getBlockPos();
        context.getPlayer().sendMessage(Text.of("测试消息"),true);

        context.getWorld().playSound(player,positionClicked, ModSounds.DOWSING_ROD_FOUND_ORE, SoundCategory.BLOCKS,
                1f,1f);

        return ActionResult.SUCCESS;
    }
}
