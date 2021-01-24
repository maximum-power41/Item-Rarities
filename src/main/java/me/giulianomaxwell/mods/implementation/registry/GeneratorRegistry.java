package me.giulianomaxwell.mods.implementation.registry;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import me.giulianomaxwell.mods.api.generation.GenerateRarityInterface;
import me.giulianomaxwell.mods.api.registry.RegistryInterface;
import net.minecraft.util.Identifier;

import java.util.Set;

public class GeneratorRegistry implements RegistryInterface<GenerateRarityInterface> {

    private static final GeneratorRegistry GENERATOR_REGISTRY_INSTANCE = new GeneratorRegistry();
    private static BiMap<Identifier, GenerateRarityInterface> GENERATOR_MAP;

    public GeneratorRegistry getInstance() {
        return GENERATOR_REGISTRY_INSTANCE;
    }

    private GeneratorRegistry() {
        GENERATOR_MAP = HashBiMap.create();
    }

    @Override
    public void register(Identifier identifier, GenerateRarityInterface value) {
        GENERATOR_MAP.put(identifier, value);
    }

    @Override
    public GenerateRarityInterface getValue(Identifier identifier) {
        return GENERATOR_MAP.get(identifier);
    }

    @Override
    public Identifier getIdentifier(GenerateRarityInterface value) {
        return GENERATOR_MAP.inverse().get(value);
    }

    @Override
    public Set<Identifier> getIdentifiers() {
        return GENERATOR_MAP.keySet();
    }

    @Override
    public Set<GenerateRarityInterface> getValues() {
        return GENERATOR_MAP.values();
    }
}
