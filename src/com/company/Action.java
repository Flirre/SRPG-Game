package com.company;

import com.Character;

/**
 * Created by flirre on 2016-02-05.
 */
public class Action {
    Character debug = new Character("Debug", Character.Job.Warrior,1, 1, 1, 1, 1, 1, 1);
    Character debug2 = new Character("Debug2", Character.Job.Warrior, 1, 1, 1, 1, 1, 1, 1);

    public void Fight (Character c, Character c2) {
        int damage = (c.attack*10) - (c2.defence*5);
        c2.health = c2.health - damage;
    }











}
