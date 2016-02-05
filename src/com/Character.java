package com;

/**
 * Created by flirre on 2016-02-05.
 */
public class Character {
    public String name;
    public Job job;
    public int health;
    public int mp;
    public int attack;
    public int defence;
    public int speed;
    public int magic;
    public int magicDefence;

    public Character(String name, Job job,int health, int mp, int attack, int defence, int speed, int magic, int magicDefence) {
        this.name = name;
        this.job = job;
        this.health = health;
        this.mp= mp;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.magic = magic;
        this.magicDefence = magicDefence;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttack(){
        return this.attack;
    }

    public int getDefence(){
        return this.defence;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getMagic(){
        return this.magic;
    }

    public int getMagicDefence(){
        return this.magicDefence;
    }

    public enum Job {
        Warrior, Archer
    }
}
