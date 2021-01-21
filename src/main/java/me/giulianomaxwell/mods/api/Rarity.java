package me.giulianomaxwell.mods.api;

import net.minecraft.util.Identifier;

public abstract class Rarity {

    private final Identifier identifier;
    private final String displayName;

    public Rarity(Identifier identifier, String displayName) {
        this.identifier = identifier;
        this.displayName = displayName;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public String getDisplayName() {
        return displayName;
    }
}
