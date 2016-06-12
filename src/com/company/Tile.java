package com.company;

/**
 * Created by flirre on 09/06/16.
 */
public class Tile {
    private int height;
    private Type type;
    public enum Type {
        GRASS, WATER, LAVA, STONE, DIRT
    }

    public Tile(int height, Type type) {
        this.height = height;
        this.type = type;
    }


    public Tile (Type type) {
        this(0, type);
    }

    public Tile() {
        this(0, Type.GRASS);
    }
    public Type getType() {
        return this.type;
    }

}
