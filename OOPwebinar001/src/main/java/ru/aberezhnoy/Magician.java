package ru.aberezhnoy;


import java.util.Random;

public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.random.nextInt(200));
        this.maxMana = Magician.random.nextInt(150);
        this.mana = maxMana;
    }

    public int attack() {
        int damage = BaseHero.random.nextInt(30);
        this.mana -= (int) (damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    @Override
    public String getInfo() {
        return String.format("%s Mana: %d",
                super.getInfo(), this.mana);
    }

    public void healed(int hp) {
        this.hp = hp + this.hp > this.maxHp ? this.maxHp : hp + this.hp;
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}
