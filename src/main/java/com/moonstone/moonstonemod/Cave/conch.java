package com.moonstone.moonstonemod.Cave;

import com.moonstone.moonstonemod.AAA;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.ModList;

import java.util.List;

public class conch extends AAA {
    @Override
    public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> tooltip, TooltipFlag flags) {
        super.appendHoverText(stack, level, tooltip, flags);
        if (ModList.get().isLoaded("alexscaves")) {

        }else {
            tooltip.add(Component.translatable("请安装 Alex的洞穴 模组来使用它").withStyle(ChatFormatting.RED));

        }
    }
}
