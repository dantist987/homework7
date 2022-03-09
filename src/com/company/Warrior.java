package com.company;


public class Warrior extends Hero implements IHavingSuperAbility {
    public Warrior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    public Warrior() {
    }

    @Override
    public void useSuperAbility(Hero[] heroes) {
        System.out.println("Warrior used CRITICAL DAMAGE ability!");

    }
}
