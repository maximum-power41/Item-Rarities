package me.giulianomaxwell.mods.api.mixin;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

public interface ModifyTooltipInterface {

    void modifyTooltip(PlayerEntity player, TooltipContext context, CallbackInfoReturnable<List<Text>> cir);
}
