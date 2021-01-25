package me.giulianomaxwell.mods.implementation.generation;

public class GeneratorSettings {

    private final boolean canGenerate;
    private final RarityGenerator.GenerationChance generationChance;

    private GeneratorSettings(boolean canGenerate, RarityGenerator.GenerationChance generationChance) {
        this.canGenerate = canGenerate;
        this.generationChance = generationChance;
    }

    public boolean canGenerate() {
        return canGenerate;
    }

    public RarityGenerator.GenerationChance getGenerationChance() {
        return generationChance;
    }

    public static class Builder {

        private boolean canGenerate;
        private RarityGenerator.GenerationChance generationChance;

        public GeneratorSettings build() {
            return new GeneratorSettings(canGenerate, generationChance);
        }

        public Builder setCanGenerate(boolean canGenerate) {
            this.canGenerate = canGenerate;
            return this;
        }

        public Builder setGenerationChance(RarityGenerator.GenerationChance generationChance) {
            this.generationChance = generationChance;
            return this;
        }
    }
}
