package ru.aberezhnoy.alliance.healers;

import ru.aberezhnoy.alliance.BaseHero;
import ru.aberezhnoy.alliance.warriors.Magician;

public class Priest extends BaseHero implements Healer {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.random.nextInt(200));
        this.maxElixir = Magician.random.nextInt(150);
        this.elixir = maxElixir;
    }

    @Override
    public String getInfo() {
        return String.format("%s Elixir: %d",
                super.getInfo(), this.elixir);
    }

    @Override
    public void healing(BaseHero target) {
        int health = BaseHero.random.nextInt(10, 20);
        target.healed(health);
    }

    @Override
    public void die() {
        System.out.println("I'm fucking die bro.. I'm Priest!!");
    }
}
