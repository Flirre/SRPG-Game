package com.company;

/**
 * Created by flirre on 2016-02-27.
 */
public class Armor extends Equipment {
    public Armor(String name, int weight, int durability) {
        super(name, weight, durability);
    }

    public Armor(String name) {
        super(name, 1, 1);
    }
}
