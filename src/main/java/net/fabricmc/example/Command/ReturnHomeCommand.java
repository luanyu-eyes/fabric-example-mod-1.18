package net.fabricmc.example.Command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.fabricmc.example.util.IEntityDataSaver;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralText;

public class ReturnHomeCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated){
        dispatcher.register(CommandManager.literal("home")
                .then(CommandManager.literal("return").executes(ReturnHomeCommand::run)));
    }

    private static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        IEntityDataSaver player = (IEntityDataSaver) context.getSource().getPlayer();

        int[] homepos = player.getPersistentData().getIntArray("homepos");
        if(homepos.length != 0){
            int[] playerPos = player.getPersistentData().getIntArray("homepos");
            context.getSource().getPlayer().requestTeleport(playerPos[0],playerPos[1],playerPos[2]);

            context.getSource().sendFeedback(new LiteralText("玩家回到记录点"),true);
            return 1;
        }else{
            context.getSource().sendFeedback(new LiteralText("记录点未设置"),true);
            return -1;
        }
    }


}
