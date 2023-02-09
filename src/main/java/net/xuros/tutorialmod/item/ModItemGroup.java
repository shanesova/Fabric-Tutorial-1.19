package net.xuros.tutorialmod.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xuros.tutorialmod.TutorialMod;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "tanzanite_group_id"))
            .icon(() -> new ItemStack(ModItems.TANZANITE))
            .build();
}
