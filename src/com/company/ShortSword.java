package com.company;

/**
 * Created by flirre on 2016-02-26.
 */
public class ShortSword extends Sword {
    public ShortSword(String name, int weight, int durability, int damage){
        super(name, weight, durability, damage);
    }

    public ShortSword(String name){
        super(name, 1, 1, 1);
    }
}
