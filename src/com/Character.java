package com;

/**
 * Created by flirre on 2016-02-05.
 */
public class Character {
    //should values be private?
    private String name;
    private Job job;
    private int health;
    private int mp;
    private int attack;
    private int defence;
    private int speed;
    private int magic;
    private int magicDefence;
    private boolean isDead;


    public Character(String name, Job job,int health, int mp, int attack, int defence, int speed, int magic, int magicDefence, boolean isDead) {
        this.name = name;
        this.job = job;
        this.health = health;
        this.mp= mp;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.magic = magic;
        this.magicDefence = magicDefence;
        this.isDead = isDead;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth){
        this.health = newHealth;
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

    public void setDead(){
        if (getHealth()<1){
            this.isDead = true;
        }
    }
    public boolean getDead(){
        return this.isDead;
    }

    public enum Job {
        Warrior, Archer
    }
}
