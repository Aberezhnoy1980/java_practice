package ru.aberezhnoy.alliance;


public class Druid extends BaseHero {

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
}
