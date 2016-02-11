package com.company;

/**
 * Created by flirre on 2016-02-05.
 */
public class Character {
    //should values be private?
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


    public Character(String name, Job job, int level, int health, int mp, int attack, int defence, int speed, int magic, int magicDefence, boolean isDead) {
        this.name = name;
        this.job = job;
        this.level = level;
        this.health = health;
        this.mp= mp;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.magic = magic;
        this.magicDefence = magicDefence;
        this.isDead = isDead;
    }

    public Character(String name){
        this.name = name;
        this.job = Job.Warrior;
        this.level = 1;
        this.health = 5;
        this.mp = 5;
        this.attack = 10;
        this.defence = 10;
        this.speed = 4;
        this.magic = 10;
        this.magicDefence = 10;
        this.isDead = false;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth){
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

    public int getAttack(){
        return this.attack;
    }

    public void setAttack(int newAttack) {
        this.attack = newAttack;
    }

    public int getDefence(){
        return this.defence;
    }

    public void setDefence(int newDefence) {
        this.defence = newDefence;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public int getMagic(){
        return this.magic;
    }

    public void setMagic(int newMagic) {
        this.magic = newMagic;
    }

    public int getMagicDefence(){
        return this.magicDefence;
    }

    public void setMagicDefence(int newMagicDefence) {
        this.magicDefence = newMagicDefence;
    }

    public boolean getDead() {
        return this.isDead;
    }

    public void setDead(){
        if (getHealth()<1){
            this.isDead = true;
        }
    }
    public enum Job {
        Warrior, Archer
    }
}
