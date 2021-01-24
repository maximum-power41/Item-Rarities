package me.giulianomaxwell.mods.api.generation;

public final class GeneratorSettings {

    private final boolean canGenerate;
    private final RarityGenerator.GenerationChance generationChance;

    private GeneratorSettings(boolean canGenerate, RarityGenerator.GenerationChance generationChance) {
        this.canGenerate = canGenerate;
        this.generationChance = generationChance;
    }

    public boolean isCanGenerate() {
        return canGenerate;
    }

    public RarityGenerator.GenerationChance getGenerationChance() {
        return generationChance;
    }

    public static final class Builder {

        private boolean canGenerate;
        private RarityGenerator.GenerationChance generationChance;

        public GeneratorSettings build() {
            return new GeneratorSettings(canGenerate, generationChance);
        }

        public void setCanGenerate(boolean canGenerate) {
            this.canGenerate = canGenerate;
        }

        public void setGenerationChance(RarityGenerator.GenerationChance generationChance) {
            this.generationChance = generationChance;
        }
    }
}
