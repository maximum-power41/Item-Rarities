package me.giulianomaxwell.mods.api.registry;

import net.minecraft.util.Identifier;

import java.util.Set;

public interface RegistryInterface <V> {

    void register(Identifier identifier, V value);

    V getValue(Identifier identifier);

    Identifier getIdentifier(V value);

    Set<Identifier> getIdentifiers();

    Set<V> getValues();
}
