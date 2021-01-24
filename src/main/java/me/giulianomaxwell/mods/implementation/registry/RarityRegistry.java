package me.giulianomaxwell.mods.implementation.registry;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import me.giulianomaxwell.mods.api.Rarity;
import me.giulianomaxwell.mods.api.registry.RegistryInterface;
import net.minecraft.util.Identifier;

import java.util.Set;

public final class RarityRegistry implements RegistryInterface<Rarity> {

    private static BiMap<Identifier, Rarity> RARITY_MAP;
    private static final RarityRegistry RARITY_REGISTRY_INSTANCE = new RarityRegistry();

    private RarityRegistry() {
        RARITY_MAP = HashBiMap.create();
    }

    public static RarityRegistry getInstance() {
        return RARITY_REGISTRY_INSTANCE;
    }

    @Override
    public void register(Identifier identifier, Rarity value) {
        RARITY_MAP.put(identifier, value);
    }

    @Override
    public Rarity getValue(Identifier identifier) {
        return RARITY_MAP.get(identifier);
    }

    @Override
    public Identifier getIdentifier(Rarity value) {
        return RARITY_MAP.inverse().get(value);
    }

    @Override
    public Set<Identifier> getIdentifiers() {
        return RARITY_MAP.keySet();
    }

    @Override
    public Set<Rarity> getValues() {
        return RARITY_MAP.values();
    }
}
