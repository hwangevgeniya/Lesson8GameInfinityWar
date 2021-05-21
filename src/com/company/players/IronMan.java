package com.company.players;

import java.util.Random;

public class IronMan extends Avenger {

    private int toFly;

    public IronMan(int health, int damage, String name, EnumSuperAbility superAbility, int toFly) {
        super(health, damage, name, superAbility);
        this.toFly = toFly;
    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {

        for (int i = 0; i < avengers.length; i++) {
            if (avengers[i].getHealth() > 0 && avengers[i] != this) {

            int min = 1;
            int max = 10;
            int diff = max - min;
            Random random = new Random();
            int toFly = random.nextInt(diff + 1) + min;

            thanos.setHealth(thanos.getHealth() - toFly);

            System.out.println(avengers[i].getName() + " + " + this.getName() + " flyed by " + toFly + " points.");

            }
        }
    }

    }

