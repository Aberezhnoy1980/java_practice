package ru.aberezhnoy;


public class Lecar extends BaseHero {

    private int drugs;
    private int maxDrugs;

    public Lecar() {
        super(String.format("Hero_Druid #%d", ++Lecar.number),
                Lecar.random.nextInt(200));
        this.maxDrugs = Lecar.random.nextInt(150);
        this.drugs = maxDrugs;
    }

    public int attack() {
        int damage = BaseHero.random.nextInt(30);
        this.drugs -= (int) (damage * 0.8);
        if (drugs < 0) return 0;
        else return damage;
    }

    @Override
    public String getInfo() {
        return String.format("%s Mana: %d",
                super.getInfo(), this.drugs);
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
