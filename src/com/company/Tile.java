package com.company;

/**
 * Created by flirre on 09/06/16.
 */
public class Tile {
    private int zpos;
    private String terrain;

    public Tile (String terrain) {
        this.zpos = 0;
        this.terrain = terrain;
    }

    public Tile(int zpos, String terrain) {
        this.zpos = zpos;
        this.terrain = terrain;
    }

    public Tile() {
        this.zpos = 0;
        this.terrain = "Grass";
    }
    public String ToString() {
    return this.terrain; //change this to first letter of the type of terrain later.
    }

}
