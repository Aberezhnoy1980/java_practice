package ru.aberezhnoy.alliance;

import ru.aberezhnoy.alliance.healers.Healer;
import ru.aberezhnoy.alliance.warriors.Warrior;

public class Lord extends BaseHero implements Warrior, Healer {
    private int power;
    private int maxPower;

    public Lord() {
        super(String.format("Lord #%d", ++Lord.number),
                BaseHero.random.nextInt(100, 1000));
        this.power = BaseHero.random.nextInt(100, 1000);
        this.maxPower = power;
    }

    @Override
    public String getInfo() {
        return String.format("%s power: %d",
                super.getInfo(), this.power);
    }

    @Override
    public void attack(BaseHero target) {
        int damage = BaseHero.random.nextInt(20, 40);
        target.getDamage(damage);
    }

    @Override
    public void healing(BaseHero target) {
        int health = BaseHero.random.nextInt(20, 40);
        target.healed(health);
    }

    @Override
    public void die() {
        System.out.println("I'm a Lord! I'm immortal");
    }
}
