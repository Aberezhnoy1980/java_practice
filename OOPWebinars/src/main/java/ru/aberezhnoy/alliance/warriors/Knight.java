package ru.aberezhnoy.alliance.warriors;


import ru.aberezhnoy.alliance.BaseHero;

public class Knight extends BaseHero implements Warrior {

    private int power;
    private int maxDrugs;

    public Knight() {
        super(String.format("Hero_Knight #%d", ++Knight.number),
                Knight.random.nextInt(200));
        this.maxDrugs = Knight.random.nextInt(150);
        this.power = maxDrugs;
    }

    @Override
    public String getInfo() {
        return String.format("%s power: %d",
                super.getInfo(), this.power);
    }

    @Override
    public void attack(BaseHero target) {
        int damage = BaseHero.random.nextInt(10, 20);
        target.getDamage(damage);
    }

    @Override
    public void die() {
        System.out.println("I'm fucking die bro.. I'm Knight!!");
    }
}
