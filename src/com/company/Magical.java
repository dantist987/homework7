package com.company;

import java.util.Random;

public class Magical extends Hero {

    public Magical(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }



    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            int additionalDamage = new Random().nextInt(100);
            int newDamage = getDamage() + additionalDamage;
            hero.setDamage(newDamage);
        }
        System.out.println("Magical used " + getSuperAbility());

    }


}



