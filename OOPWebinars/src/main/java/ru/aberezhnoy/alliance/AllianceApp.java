package ru.aberezhnoy.alliance;

import ru.aberezhnoy.alliance.healers.Druid;
import ru.aberezhnoy.alliance.healers.Priest;
import ru.aberezhnoy.alliance.warriors.Knight;
import ru.aberezhnoy.alliance.warriors.Magician;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AllianceApp {
    public static void main(String[] args) {
        int teamCount = 12;
        final Random rand = new Random();

        int magicianCount = 0;
        int priestCount = 0;
        int druidCount = 0;
        int lecarCount = 0;

        final List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0 -> {
                    teams.add(new Priest());
                    priestCount++;
                }
                case 1 -> {
                    teams.add(new Magician());
                    magicianCount++;
                }
                case 2 -> {
                    teams.add(new Druid());
                    druidCount++;
                }
                default -> {
                    teams.add(new Knight());
                    lecarCount++;
                }
            }
            System.out.println(teams.get(i).getInfo());
        }
        System.out.printf("magicianCount: %d priestCount: %d druidCount: %d lecarCount: %d \n\n", magicianCount, priestCount, druidCount, lecarCount);

        Druid druid = new Druid();
        Magician mag = new Magician();
        Priest priest = new Priest();

        System.out.println();

//        System.out.println(mag.getInfo());
        System.out.println(druid.getInfo());

        mag.attack(druid);

        System.out.println();
//        System.out.println(mag.getInfo());
        System.out.println(druid.getInfo());

        System.out.println();

        priest.healing(druid);

        System.out.println(druid.getInfo());

        System.out.println("----------------");

        final Lord lord = new Lord();
        final Knight knight = new Knight();

        System.out.println(lord.getInfo() + "\n" + knight.getInfo());

        lord.attack(knight);

        System.out.println("Knight after battle: " + knight.getInfo());

        lord.healing(knight);

        System.out.println("Knight after healing: " + knight.getInfo());
    }
}
