package net.fabricmc.example.util;

import net.fabricmc.example.Command.ReturnHomeCommand;
import net.fabricmc.example.Command.SetHomeCommand;
import net.fabricmc.example.event.ModPlayerEventCopyFrom;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.Event;

public class ModRegistries {
    public static void registerModStuffs(){
        registerCommands();
        registerEvents();
    }

    private static void registerCommands(){
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }

    private static void registerEvents(){
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerEventCopyFrom());
    }
}
