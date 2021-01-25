package me.giulianomaxwell.mods.implementation;

import me.giulianomaxwell.mods.api.Rarity;
import me.giulianomaxwell.mods.implementation.generation.GeneratorSettings;
import me.giulianomaxwell.mods.implementation.generation.RarityGenerator;

public final class EpicRarity extends Rarity {

    public EpicRarity() {
        super("EPIC");
    }

    @Override
    public GeneratorSettings generateRarity() {
        return new GeneratorSettings.Builder().setCanGenerate(true).setGenerationChance(RarityGenerator.GenerationChance.EXOTIC).build();
    }
}
