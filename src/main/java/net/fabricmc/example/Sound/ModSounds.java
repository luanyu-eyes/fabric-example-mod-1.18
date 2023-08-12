package net.fabricmc.example.Sound;

import net.fabricmc.example.ExampleMod;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent DOWSING_ROD_FOUND_ORE = registerSoundEvent("dowsing_rod_found_ore");

    public static SoundEvent MY_LAMP_BREAK = registerSoundEvent("my_lamp_break");
    public static SoundEvent MY_LAMP_STEP = registerSoundEvent("my_lamp_step");
    public static SoundEvent MY_LAMP_PLACE = registerSoundEvent("my_lamp_place");
    public static SoundEvent MY_LAMP_HIT= registerSoundEvent("my_lamp_hit");
    public static SoundEvent MY_LAMP_FALL = registerSoundEvent("my_lamp_fall");

    public static final BlockSoundGroup MY_SOUNDS = new BlockSoundGroup(1f,1f,
            ModSounds.MY_LAMP_BREAK,ModSounds.MY_LAMP_STEP,ModSounds.MY_LAMP_PLACE,
            ModSounds.MY_LAMP_HIT,ModSounds.MY_LAMP_FALL);

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(ExampleMod.MOD_ID,name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
