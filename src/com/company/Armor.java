package com.company;

/**
 * Created by flirre on 2016-02-27.
 */
public class Armor extends Equipment {
    protected int defense;

    public Armor(String name, int weight, int durability, int defense) {
        super(name, weight, durability);
        this.defense = defense;
    }

    public Armor(String name) {
        super(name, 1, 1);
    }
}
