package com.company;

/**
 * Created by flirre on 2016-02-18.
 */
public abstract class Equipment {
    protected String name;
    protected int weight;
    protected int durability;
    protected boolean isEquipped;

    public Equipment(String name, int weight, int durability) {
        this.name = name;
        this.weight = weight;
        this.durability = durability;
    }

}
