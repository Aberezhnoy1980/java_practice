package ru.aberezhnoy.alliance;

import java.util.Random;

public abstract class BaseHero {
    protected static int number;
    protected static Random random;

    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 0;
        BaseHero.random = new Random();
    }

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() {
        this(String.format("Hero #%d", ++BaseHero.number),
                BaseHero.random.nextInt(100, 200));
    }

    protected String getInfo() {
        return String.format("Name: %s hp: %d Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(int hp) {
        this.hp = hp + this.hp > this.maxHp ? this.maxHp : hp + this.hp;
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else {
            die();
        }
    }

    public abstract void die();
}
