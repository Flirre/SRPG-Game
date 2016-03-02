package com.company;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by flirre on 2016-02-05.
 */
public class Character {
    private String name;
    private Job job;
    private int level;
    private int health;
    private int mp;
    private int attack;
    private int defence;
    private int speed;
    private int magic;
    private int magicDefence;
    private boolean isDead;
    private int xpos;
    private int ypos;
    protected boolean swordisFree;
    protected boolean shieldisFree;
    protected boolean TorsoisFree;
    protected ArrayList<Weapon> equippedWeapons;
    protected ArrayList<Armor>  equippedArmor;


    public Character(String name, Job job, int level, int health, int mp, int attack, int defence, int speed, int magic, int magicDefence, boolean isDead, int xpos, int ypos) {
        this.name = name;
        this.job = job;
        this.level = level;
        this.health = health;
        this.mp = mp;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.magic = magic;
        this.magicDefence = magicDefence;
        this.isDead = isDead;
        this.xpos = xpos;
        this.ypos = ypos;
        this.equippedWeapons = new ArrayList<Weapon>();
        this.equippedArmor = new ArrayList<Armor>();

    }

    public Character(String name) {
        this(name, Job.Warrior, 1, 1, 1, 1, 1, 1, 1, 1, false, 0, 0);
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public Job getJob() {
        return this.job;
    }

    public void setJob(Job newJob) {
        this.job = newJob;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int newLevel) {
        this.level = newLevel;
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int newMp) {
        this.mp = newMp;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int newAttack) {
        this.attack = newAttack;
    }

    public int getDefence() {
        return this.defence;
    }

    public void setDefence(int newDefence) {
        this.defence = newDefence;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public int getMagic() {
        return this.magic;
    }

    public void setMagic(int newMagic) {
        this.magic = newMagic;
    }

    public int getMagicDefence() {
        return this.magicDefence;
    }

    public void setMagicDefence(int newMagicDefence) {
        this.magicDefence = newMagicDefence;
    }

    public boolean getDead() {
        return this.isDead;
    }

    public void checkDead() {
        if (getHealth() < 1) {
            this.isDead = true;
        }
    }

    public int getXpos() {
        return this.xpos;
    }

    public void setXpos(int newXpos) {
        this.xpos = newXpos;
    }

    public int getYpos() {
        return this.ypos;
    }

    public void setYpos(int newYpos) {
        this.ypos = newYpos;
    }

    public enum Job {
        Warrior, Archer
    }

    public void equipWeapon(Weapon weapon){
        this.equippedWeapons.add(weapon);
    }

    public void equipArmor(Armor armor) {
        this.equippedArmor.add(armor);
    }

    public int equippedDamage() {
        int equippedDamage = 0;
        ListIterator<Weapon> weaponListIterator = equippedWeapons.listIterator();
        ArrayList<Integer> damageList = new ArrayList<>(); //Make sure to use this ArrayList somehow, otherwise simplify this method if possible.

        while (weaponListIterator.hasNext()){
            damageList.add(weaponListIterator.next().damage);
        }

        for (int i : damageList) {
            equippedDamage = equippedDamage + damageList.get(i);

        }

        return equippedDamage;
    }

    public int equippedDefence(){
        int equippedDefence = 0;
        ListIterator<Armor> armorListIterator = equippedArmor.listIterator();
        ArrayList<Integer> defenceList = new ArrayList<>();//See above

        while (armorListIterator.hasNext()){
            defenceList.add(armorListIterator.next().defense);
        }

        for (int i=0; i<defenceList.size(); i++) {
            equippedDefence = equippedDefence + defenceList.get(i);

        }

        return equippedDefence;
    }

}
