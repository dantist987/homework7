package com.company;


import java.util.Random;

public class Warrior extends Hero {


    public Warrior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);

    }


    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        criticalStrike();
        System.out.println("Warrior used " + getSuperAbility());
    }

    public void criticalStrike() {
        int newDamage = getDamage() * new Random().nextInt(1, 4);
        setDamage(newDamage);
    }


}


