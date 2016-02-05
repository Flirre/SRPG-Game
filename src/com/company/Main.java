package com.company;

import com.Character;

public class Main {

    public static void main(String[] args) {
    Character debug = new Character("Debug", Character.Job.Warrior, 10, 1, 1, 1, 1, 1, 1);
    Character debug2 = new Character("Debug2", Character.Job.Archer, 2, 1, 1, 1, 1, 1, 1);
    Action.Fight(debug,debug2);
    System.out.println(debug.getHealth());
    System.out.println(debug2.getHealth());
    }





















}
