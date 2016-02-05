package com.company;

import com.Character;

public class Main {

    public static void main(String[] args) {
    Character debug = new Character("Debug", Character.Job.Warrior, 10, 0, 5, 5, 4, 0, 2, false);
    Character debug2 = new Character("Debug2", Character.Job.Archer, 4, 0, 4, 4, 6, 0, 2, false);
    Action.Fight(debug,debug2);
        debug.setDead();
        debug2.setDead();
    System.out.println(debug.getHealth());
    System.out.println(debug2.getHealth());
    System.out.println("Is debug dead? " + debug.getDead());
    System.out.println("Is debug2 dead? " + debug2.getDead());
    }





















}
