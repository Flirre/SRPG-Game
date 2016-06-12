package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
    Character debug = new Character("Debug", 0, 0);
    Character debug2 = new Character("Debug2", 0, 1);
    ShortSword testsword = new ShortSword("TairaSlayer");
    Armor testarmor = new Armor("TestArmor");
    System.out.print("Level: ");
    System.out.println(debug.getLevel());
    System.out.print("Health, pre levelup: ");
    System.out.println(debug.getHealth());
    debug.levelUp();
    System.out.print("Level: ");
    System.out.println(debug.getLevel());
    System.out.print("Health, post levelup: ");
    System.out.println(debug.getHealth());
    System.out.println("Name of Testsword: " + testsword.name);
    System.out.println("Testswords damage: " + testsword.damage);
    System.out.println("Equipped damage: " + debug.equippedDamage());
    System.out.println("Start Equip");
    debug.equipWeapon(testsword);
    //debug.equipWeapon(testsword);
    debug2.equipArmor(testarmor);
    System.out.println("Equipped Damage: " + debug.equippedDamage());
    System.out.println("Equip Finished");
    System.out.println("Debugs health prefight: " + debug.getHealth());
    System.out.println("Debug2s health prefight: " + debug2.getHealth());
    Action.Fight(debug,debug2);
        debug.checkDead();
        debug2.checkDead();
    System.out.println("Debugs health postfight: " + debug.getHealth());
    System.out.println("Debug2s health postfight: " + debug2.getHealth());
    System.out.println("Is debug dead? " + debug.getDead());
    System.out.println("Is debug2 dead? " + debug2.getDead());
    Tile testTile = new Tile();
    Map map = new Map(testTile);
    System.out.println("printing testtile..");
    System.out.println(testTile.ToString());
    System.out.println("printing map..");
    System.out.println(map);
    ArrayList<Integer> map1 = map.readMap("maps/map1.txt"); // Just change ArrayList stuff to Map when readmap has been updated.
    //map1.get(1);
    }





















}
