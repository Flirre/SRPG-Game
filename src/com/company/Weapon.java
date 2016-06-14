package com.company;

/**
 * Created by flirre on 2016-02-27.
 */
public class Weapon extends Equipment {
    protected int damage;
    protected int range;

    public Weapon(String name, int weight, int durability, int damage, int range){
        super(name, weight, durability);
        this.damage = damage;
        this.range = range;
    }
}
