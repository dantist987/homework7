package com.company;

public class Golem extends Hero {



    public Golem(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        addHalfBossDamage(boss.getDamage());
        System.out.println("Golem used " + getSuperAbility());
    }

    public void addHalfBossDamage(int bossDamage){
        int newDamage = getDamage() + bossDamage / 2;
        setDamage(newDamage);
    }
}
