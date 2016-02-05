package com.company;

import com.Character;

/**
 * Created by flirre on 2016-02-05.
 */
public class Action {
    public static void Fight (Character c, Character c2) {
        int damage = (c.attack*10) - (c2.defence*5); //placeholder values
        c2.health = c2.health - damage;
    }











}
