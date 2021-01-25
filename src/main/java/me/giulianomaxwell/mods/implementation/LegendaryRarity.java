package me.giulianomaxwell.mods.implementation;

import me.giulianomaxwell.mods.api.Rarity;
import me.giulianomaxwell.mods.implementation.generation.GeneratorSettings;
import me.giulianomaxwell.mods.implementation.generation.RarityGenerator;

public final class LegendaryRarity extends Rarity {

    public LegendaryRarity() {
        super("LEGENDARY");
    }

    @Override
    public GeneratorSettings generateRarity() {
        return new GeneratorSettings.Builder().setCanGenerate(true).setGenerationChance(RarityGenerator.GenerationChance.VERY_RARE).build();
    }
}
