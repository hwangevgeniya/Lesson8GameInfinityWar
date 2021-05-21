package com.company.players;

import java.util.Random;

public class CaptainAmerica extends Avenger {


    private int shieldDamage;

    public CaptainAmerica(int health, int damage, String name, EnumSuperAbility superAbility, int shieldDamage) {
        super(health, damage, name, superAbility);
        this.shieldDamage = shieldDamage;

    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {

            if (this.getHealth() > 0 && thanos.getHealth() > 0) {

                int min = 2;
                int max = 5;
                int diff = max - min;
                Random random = new Random();
                int shieldDamage = random.nextInt(diff + 1) + min;

                thanos.setHealth(thanos.getHealth() - (thanos.getDamage()/shieldDamage));

                System.out.println("Captain America Super Ability - Shield damage = " +
                        (thanos.getDamage()/shieldDamage));

    }

       // thanos.setHealth((thanos.getDamage()/5) + this.getDamage());

      //  System.out.println("Captain America Super Ability - Additional damage = " + this.getDamage());

    }
}
