package com.company;

public class Main {

    public static void main(String[] args) {
    Character debug = new Character("Debug");
    Character debug2 = new Character("Debug2");
    ShortSword testsword = new ShortSword(("Test"));
    System.out.println(testsword.getName());
    System.out.println(debug.hasEquipped());
    debug.equip(testsword);
    System.out.println(debug.hasEquipped());
    Action.Fight(debug,debug2);
        debug.setDead();
        debug2.setDead();
    System.out.println(debug.getHealth());
    System.out.println(debug2.getHealth());
    System.out.println("Is debug dead? " + debug.getDead());
    System.out.println("Is debug2 dead? " + debug2.getDead());
    }





















}
