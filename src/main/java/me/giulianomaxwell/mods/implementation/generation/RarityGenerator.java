package me.giulianomaxwell.mods.implementation.generation;

import me.giulianomaxwell.mods.api.Rarity;
import me.giulianomaxwell.mods.implementation.registry.RarityRegistry;

import java.util.Random;
import java.util.Set;

public final class RarityGenerator {

    private final static Random RANDOM = new Random();

    public RarityGenerator() {}

    public Rarity generateRarity() {

        int max = 100;
        int min = 1;
        int ran = RANDOM.nextInt() * ((max - min) + min);

        GenerationChance chosenChance = chooseChance(ran);
        Set<Rarity> raritySet = RarityRegistry.getInstance().getValues();
    }

    private GenerationChance chooseChance(int value) {
        GenerationChance generationChance = GenerationChance.COMMON;
        GenerationChance[] chances = GenerationChance.values();
        int lastChance = 0;
        for (int i = 0; i < chances.length; i++) {
            if (i+1 == chances.length) generationChance =  chances[i];
            if (lastChance < value && chances[i].getChance() >= value) generationChance = chances[i];
            lastChance = chances[i].getChance();
        }

        return generationChance;
    }

    public enum GenerationChance {
        EXOTIC(1),
        VERY_RARE(5),
        RARE(15),
        UNCOMMON(25),
        COMMON(54);

        private final int chance;

        GenerationChance(int chance) {
            this.chance = chance;
        }

        public int getChance() {
            return chance;
        }
    }
}
