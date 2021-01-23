package me.giulianomaxwell.mods;

import me.giulianomaxwell.mods.implementation.*;
import me.giulianomaxwell.mods.implementation.registry.RarityRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class ItemRarities implements ModInitializer {

    private static final String MOD_ID = "itemrarities";

    @Override
    public void onInitialize() {

        Identifier noRarityId = new Identifier(MOD_ID, "rarity_none");
        Identifier uncommonRarityId = new Identifier(MOD_ID, "rarity_uncommon");
        Identifier rareRarityId = new Identifier(MOD_ID, "rarity_rare");
        Identifier legendaryRarityId = new Identifier(MOD_ID, "legendary_rarity");
        Identifier epicRarityId = new Identifier(MOD_ID, "epic_rarity");

        RarityRegistry.getInstance().register(noRarityId, new NoRarity());
        RarityRegistry.getInstance().register(uncommonRarityId, new UncommonRarity());
        RarityRegistry.getInstance().register(rareRarityId, new RareRarity());
        RarityRegistry.getInstance().register(legendaryRarityId, new LegendaryRarity());
        RarityRegistry.getInstance().register(epicRarityId, new EpicRarity());
    }
}
