package ru.aberezhnoy.alliance.warriors;


import ru.aberezhnoy.alliance.BaseHero;
import ru.aberezhnoy.alliance.healers.Healer;

public class Magician extends BaseHero implements Warrior {

    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.random.nextInt(100, 200));
        this.maxMana = Magician.random.nextInt(50, 150);
        this.mana = maxMana;
    }

    @Override
    public String getInfo() {
        return String.format("%s Mana: %d",
                super.getInfo(), this.mana);
    }

    @Override
    public void attack(BaseHero target) {
        int damage = BaseHero.random.nextInt(10, 20);
        target.getDamage(damage);
    }

    @Override
    public void die() {
        System.out.println("I'm fucking die bro.. I'm Magician!!");
    }
}
