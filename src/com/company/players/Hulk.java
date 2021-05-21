package com.company.players;

import java.util.Random;

public class Hulk extends Avenger {

    private int allCrash;

    public Hulk(int health, int damage, String name, EnumSuperAbility superAbility, int allCrash) {
        super(health, damage, name, superAbility);
        this.allCrash = allCrash;
    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {

        if (this.getHealth() > 0 && thanos.getHealth() > 0) {

            int min = 2;
            int max = 4;
            int diff = max - min;
            Random random = new Random();
            int allCrash = random.nextInt(diff + 1) + min;

            thanos.setHealth(thanos.getHealth() - (this.getDamage()*allCrash));

            System.out.println("Hulk Super Ability - All Crash = " + allCrash + " * " + this.getDamage());

        }

    }
}
