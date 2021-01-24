package me.giulianomaxwell.mods.api.generation;

import java.util.Random;

public final class RarityGenerator {

    private static Random RANDOM = new Random();

    public RarityGenerator() {}

    public enum GenerationChance {
        NONE,
        EXTREMELY_LOW,
        VERY_LOW,
        LOW,
        MEDIUM,
        HIGH
    }
}
