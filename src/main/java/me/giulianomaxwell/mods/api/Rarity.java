package me.giulianomaxwell.mods.api;

import me.giulianomaxwell.mods.api.generation.GenerateRarityInterface;

public abstract class Rarity implements GenerateRarityInterface {

    private final String displayName;

    public Rarity(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
