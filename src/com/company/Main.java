package com.company;

public class Main {

    public static void main(String[] args) {
    Character debug = new Character("Debug");
    Character debug2 = new Character("Debug2");
    Weapon testweapon = new Weapon("TestWeapon", 1, 1, 1);
    ShortSword testsword = new ShortSword("TestSword");
    Armor testarmor = new Armor("TestArmor");
    System.out.println("Job:");
    System.out.println(debug.getJob());
    System.out.println("Level");
    System.out.println(debug.getLevel());
    System.out.println("Health, pre levelup");
    System.out.println(debug.getHealth());
    debug.levelUp();
    System.out.println("Level");
    System.out.println(debug.getLevel());
    System.out.println("Health, post levelup");
    System.out.println(debug.getHealth());
    System.out.println(testweapon.name);
    System.out.println(testsword.name);
    System.out.println(testsword.damage);
    System.out.println(debug.equippedDamage());
    System.out.println("Start Equip");
    debug.equipWeapon(testsword);
    debug.equipWeapon(testsword);
    debug2.equipArmor(testarmor);
    System.out.println(debug.equippedDamage());
    System.out.println("Equip Finished");
    Action.Fight(debug,debug2);
        debug.checkDead();
        debug2.checkDead();
    System.out.println(debug.getHealth());
    System.out.println(debug2.getHealth());
    System.out.println("Is debug dead? " + debug.getDead());
    System.out.println("Is debug2 dead? " + debug2.getDead());
    }





















}
