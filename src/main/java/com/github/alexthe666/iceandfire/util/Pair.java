package com.github.alexthe666.iceandfire.util;

import java.io.Serializable;

// I had to make a new class for Pair since OpenJDK doesn't have JavaFX,
// and I kept running into issues when I tried to manually add it to the project.
public class Pair<K,V> implements Serializable
{

    /**
     * Key of this <code>Pair</code>.
     */
    private K key;

    /**
     * Gets the key for this pair.
     * @return key for this pair
     */
    public K getKey() { return key; }

    /**
     * Value of this this <code>Pair</code>.
     */
    private V value;

    /**
     * Gets the value for this pair.
     * @return value for this pair
     */
    public V getValue() { return value; }

    /**
     * Creates a new pair
     * @param key The key for this pair
     * @param value The value to use for this pair
     */
    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
}