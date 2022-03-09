package com.company;

public class Magic extends Hero implements IHavingSuperAbility {


    public Magic() {
    }

    public Magic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }


    @Override
    public void useSuperAbility(Hero[] heroes) {
        System.out.println("Magic used DAMAGE INCREASE ability!");

    }
}
