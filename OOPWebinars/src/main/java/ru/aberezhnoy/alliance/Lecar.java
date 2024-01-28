package ru.aberezhnoy.alliance;


public class Lecar extends BaseHero {

    private int drugs;
    private int maxDrugs;

    public Lecar() {
        super(String.format("Hero_Lecar #%d", ++Lecar.number),
                Lecar.random.nextInt(200));
        this.maxDrugs = Lecar.random.nextInt(150);
        this.drugs = maxDrugs;
    }

    @Override
    public String getInfo() {
        return String.format("%s Drugs: %d",
                super.getInfo(), this.drugs);
    }
}
