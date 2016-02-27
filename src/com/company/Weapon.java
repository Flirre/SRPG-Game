package com.company;

/**
 * Created by flirre on 2016-02-27.
 */
public class Weapon extends Equipment {
    protected int damage;

    public Weapon(String name, int weight, int durability, int damage){
        super(name, weight, durability);
        this.damage = damage;
    }
}
