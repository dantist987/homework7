package com.company;

public class Medic extends Hero implements IHavingSuperAbility {

    public Medic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    public Medic() {
    }

    @Override
    public void useSuperAbility(Hero[] heroes) {
        System.out.println("Medic used HEALING ability!");

    }
}
