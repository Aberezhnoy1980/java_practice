package ru.aberezhnoy.alliance;

import java.awt.font.ImageGraphicAttribute;
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
                    teams.add(new Lecar());
                    lecarCount++;
                }
            }
            System.out.println(teams.get(i).getInfo());
        }
        System.out.printf("magicianCount: %d priestCount: %d druidCount: %d lecarCount: %d \n\n", magicianCount, priestCount, druidCount, lecarCount);
    }
}
