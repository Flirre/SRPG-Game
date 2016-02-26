package com.company;

/**
 * Created by flirre on 2016-02-18.
 */
public class Sword extends Equipment {
    protected int damage;

    public Sword (String name, int weight, int durability, int damage){
        super(name, weight, durability);
        this.damage = damage;
    }
}
