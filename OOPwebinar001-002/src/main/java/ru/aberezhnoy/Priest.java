package ru.aberezhnoy;

import java.util.Random;

public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.random.nextInt(200));
        this.maxElixir = Magician.random.nextInt(150);
        this.elixir = maxElixir;
    }

    public int attack() {
        int damage = BaseHero.random.nextInt(30);
        this.elixir -= (int) (damage * 0.8);
        if (elixir < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s Elixir: %d",
                super.getInfo(), this.elixir);
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
