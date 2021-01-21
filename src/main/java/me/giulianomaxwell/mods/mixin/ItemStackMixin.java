package me.giulianomaxwell.mods.mixin;

import me.giulianomaxwell.mods.api.Rarity;
import me.giulianomaxwell.mods.api.mixin.ItemRarityInterface;
import me.giulianomaxwell.mods.api.mixin.ModifyTooltipInterface;
import me.giulianomaxwell.mods.implementation.NoRarity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin implements ItemRarityInterface, ModifyTooltipInterface {

    private Rarity itemRarity = new NoRarity();

    @Override
    public Rarity getRarity() {
        return itemRarity;
    }

    @Override
    public void setRarity(Rarity rarity) {
        itemRarity = rarity;
    }

    @Override
    @Inject(method = "getTooltip", at = @At("RETURN"))
    public void modifyTooltip(PlayerEntity player, TooltipContext context, CallbackInfoReturnable<List<Text>> cir) {
        cir.getReturnValue().add(new LiteralText(itemRarity.getDisplayName()));
    }
}
