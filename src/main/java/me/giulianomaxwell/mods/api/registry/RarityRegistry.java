package me.giulianomaxwell.mods.api.registry;

import com.google.common.collect.HashBiMap;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.Map;

public final class RarityRegistry {

    private final Map<Identifier, Rarity> rarityMap;
    private static final RarityRegistry RARITY_REGISTRY_INSTANCE = new RarityRegistry();

    private RarityRegistry() {
        rarityMap = HashBiMap.create();
    }

    public static RarityRegistry getInstance() {
        return RARITY_REGISTRY_INSTANCE;
    }
}
