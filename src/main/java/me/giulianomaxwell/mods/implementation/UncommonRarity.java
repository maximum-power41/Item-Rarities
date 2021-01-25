package me.giulianomaxwell.mods.implementation;

import me.giulianomaxwell.mods.api.Rarity;
import me.giulianomaxwell.mods.implementation.generation.GeneratorSettings;
import me.giulianomaxwell.mods.implementation.generation.RarityGenerator;

public final class UncommonRarity extends Rarity {

    public UncommonRarity() {
        super("UNCOMMON");
    }

    @Override
    public GeneratorSettings generateRarity() {
        return new GeneratorSettings.Builder().setCanGenerate(true).setGenerationChance(RarityGenerator.GenerationChance.UNCOMMON).build();
    }
}
