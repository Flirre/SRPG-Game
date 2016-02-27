package com.company;

public class Main {

    public static void main(String[] args) {
    Character debug = new Character("Debug");
    Character debug2 = new Character("Debug2");
    Weapon testweapon = new Weapon("TestWeapon", 1, 1, 1);
    ShortSword testsword = new ShortSword("TestSword");
    Armor testarmor = new Armor("TestArmor");

    System.out.println(testweapon.name);
    System.out.println(testsword.name);
    System.out.println(testarmor.name);
    System.out.println(debug.hasWeaponEquipped());
    System.out.println("Starting Equip!");
    //debug.equipWeapon(testsword);
    //debug.equip(testarmor);
    //debug.equipWeapon(testsword);
    //debug.equip(testarmor);
    System.out.println("Equip Successful!");
    System.out.println(debug.hasWeaponEquipped());

    Action.Fight(debug,debug2);
        debug.setDead();
        debug2.setDead();
    System.out.println(debug.getHealth());
    System.out.println(debug2.getHealth());
    System.out.println("Is debug dead? " + debug.getDead());
    System.out.println("Is debug2 dead? " + debug2.getDead());
    }





















}
