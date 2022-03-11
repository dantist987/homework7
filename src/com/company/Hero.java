package com.company;

public abstract class Hero implements IHavingSuperAbility {
    private int health;
    private int damage;
    private String superAbility;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }


}

