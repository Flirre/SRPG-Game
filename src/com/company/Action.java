package com.company;

/**
 * Created by flirre on 2016-02-05.
 */
public class Action {
    public static void Fight (Character c, Character c2) {
        //maybe check if health is >0.
        c2.setHealth(c2.getHealth() - damageCalc(c,c2));
        if (c.getDead()){
            //remove action-phase or make unplayable somehow.
        }
        if (c2.getDead()){

        }

    }

    public static int damageCalc (Character c, Character c2) {
        int damage = ((c.getAttack()*10)+c.equippedDamage()) - ((c2.getDefence()*5)+c2.equippedDefence()); //placeholder values
        return damage;
    }











}
