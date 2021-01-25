package me.giulianomaxwell.mods.implementation;

import me.giulianomaxwell.mods.api.Rarity;
import me.giulianomaxwell.mods.implementation.generation.GeneratorSettings;
import me.giulianomaxwell.mods.implementation.generation.RarityGenerator;

public final class NoRarity extends Rarity {

    public NoRarity() {
        super("NONE");
    }

    @Override
    public GeneratorSettings generateRarity() {
        return new GeneratorSettings.Builder().setCanGenerate(true).setGenerationChance(RarityGenerator.GenerationChance.COMMON).build();
    }
}
