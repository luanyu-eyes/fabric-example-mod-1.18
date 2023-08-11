package net.fabricmc.example.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class TestItem extends Item {
    public TestItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        context.getPlayer().sendMessage(Text.of("测试消息"),true);
        return ActionResult.SUCCESS;
    }
}
