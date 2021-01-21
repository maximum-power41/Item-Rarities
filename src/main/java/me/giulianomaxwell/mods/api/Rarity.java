package me.giulianomaxwell.mods.api;

public abstract class Rarity {

    private final String displayName;

    public Rarity(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
