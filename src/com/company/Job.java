package com.company;

/**
 * Created by flirre on 2016-03-03.
 */
public class Job {
    protected int healthGrowth;
    protected int mpGrowth;
    protected int attackGrowth;
    protected int defenceGrowth;
    protected int speedGrowth;
    protected int magicGrowth;
    protected int magicDefenceGrowth;

    public Job (int healthGrowth, int mpGrowth, int attackGrowth, int defenceGrowth, int speedGrowth, int magicGrowth, int magicDefenceGrowth) {
        this.healthGrowth = healthGrowth;
        this.mpGrowth = mpGrowth;
        this.attackGrowth = attackGrowth;
        this.defenceGrowth = defenceGrowth;
        this.speedGrowth = speedGrowth;
        this.magicGrowth = magicGrowth;
        this.magicDefenceGrowth = magicDefenceGrowth;

    }
}
