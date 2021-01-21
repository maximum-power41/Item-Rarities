package me.giulianomaxwell.mods.mixin;

import me.giulianomaxwell.mods.api.Rarity;
import me.giulianomaxwell.mods.api.mixin.ItemRarityInterface;
import me.giulianomaxwell.mods.implementation.NoRarity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ItemStack.class)
public abstract class ItemRarityMixin implements ItemRarityInterface {

    private Rarity itemRarity = new NoRarity();

    @Override
    public Rarity getRarity() {
        return itemRarity;
    }

    @Override
    public void setRarity(Rarity rarity) {
        itemRarity = rarity;
    }
}
