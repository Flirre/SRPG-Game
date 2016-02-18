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
    private int xpos;
    private int ypos;
    protected boolean isFree;


    public Character(String name, Job job, int level, int health, int mp, int attack, int defence, int speed, int magic, int magicDefence, boolean isDead, int xpos, int ypos) {
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
        this.xpos = xpos;
        this.ypos = ypos;

    }

    public Character(String name){
        this(name, Job.Warrior, 1, 1, 1, 1, 1, 1, 1, 1, false, 0, 0);
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

    public void setDead() {
        if (getHealth()<1){
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

}
