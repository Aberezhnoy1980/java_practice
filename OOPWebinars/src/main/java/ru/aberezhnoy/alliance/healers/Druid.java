package ru.aberezhnoy.alliance.healers;


import ru.aberezhnoy.alliance.BaseHero;

public class Druid extends BaseHero implements Healer {

    private int power;
    private int maxPower;

    public Druid() {
        super(String.format("Hero_Druid #%d", ++Druid.number),
                Druid.random.nextInt(200));
        this.maxPower = Druid.random.nextInt(50, 150);
        this.power = maxPower;
    }

    @Override
    public String getInfo() {
        return String.format("%s Power: %d",
                super.getInfo(), this.power);
    }

    @Override
    public void healing(BaseHero target) {
        int health = BaseHero.random.nextInt(10, 20);
        target.healed(health);
    }

    @Override
    public void die() {
        System.out.println("I'm fucking die bro.. I'm Druid!!");
    }
}
