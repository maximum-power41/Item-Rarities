package me.giulianomaxwell.mods.implementation.registry;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import me.giulianomaxwell.mods.api.Rarity;
import me.giulianomaxwell.mods.api.registry.RegistryInterface;
import net.minecraft.util.Identifier;

import java.util.Set;

public final class RarityRegistry implements RegistryInterface<Rarity> {

    private final BiMap<Identifier, Rarity> rarityMap;
    private static final RarityRegistry RARITY_REGISTRY_INSTANCE = new RarityRegistry();

    private RarityRegistry() {
        rarityMap = HashBiMap.create();
    }

    public static RarityRegistry getInstance() {
        return RARITY_REGISTRY_INSTANCE;
    }

    @Override
    public void register(Identifier identifier, Rarity value) {
        rarityMap.put(identifier, value);
    }

    @Override
    public Rarity getValue(Identifier identifier) {
        return rarityMap.get(identifier);
    }

    @Override
    public Identifier getIdentifier(Rarity value) {
        return rarityMap.inverse().get(value);
    }

    @Override
    public Set<Identifier> getIdentifiers() {
        return rarityMap.keySet();
    }

    @Override
    public Set<Rarity> getValues() {
        return rarityMap.values();
    }
}
