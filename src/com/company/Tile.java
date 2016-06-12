package com.company;

/**
 * Created by flirre on 09/06/16.
 */
public class Tile {
    private int[] pos;
    private Type type;
    public enum Type {
        GRASS, WATER, LAVA, STONE, DIRT
    }

    public Tile(int[] pos, Type type) {
        this.pos = pos;
        this.type = type;
    }


    public Tile (Type type) {
        this(new int[] {0,0,0}, type);
    }

    public Tile() {
        this(new int[] {0,0,0}, Type.GRASS);
    }
    public Type getType() {
        return this.type;
    }

}
