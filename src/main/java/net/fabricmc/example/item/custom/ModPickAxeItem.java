package net.fabricmc.example.item.custom;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ModPickAxeItem extends PickaxeItem {
    public ModPickAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
