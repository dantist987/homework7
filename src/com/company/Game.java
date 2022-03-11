package com.company;


public class Game {
    private static int roundCounter = 1;


    private static void printStatistics(Hero[] heroes, Boss boss) {
        System.out.println("-----------------");
        System.out.println("Round: " + roundCounter);
        System.out.println("Boss health: " + boss.getHealth());
        for (Hero value : heroes) {
            System.out.println(value.getClass().getSimpleName() + " health: " + value.getHealth());
        }
        System.out.println("-----------------");
    }

    private static void heroesHits(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && boss.getHealth() > 0) {
                if (boss.getHealth() - hero.getDamage() <= 0) {
                    boss.setHealth(0);
                } else {
                    boss.setHealth(boss.getHealth() - hero.getDamage());
                }
            }
        }
    }

    private static void bossHits(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                if (hero.getHealth() - boss.getDamage() < 0) {
                    hero.setHealth(0);
                } else {
                    hero.setHealth(hero.getHealth() - boss.getDamage());
                }
            }
        }
    }

    private static boolean isGameOver(Hero[] heroes, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }

        boolean allHeroesDead = true;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }

        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }

    private static void round(Hero[] heroes, Boss boss) {
        if (boss.getHealth() > 0) {
            bossHits(heroes, boss);
        }

        heroesHits(heroes, boss);

        useAbility(heroes, boss);

        printStatistics(heroes, boss);


    }

    public static void useAbility(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            hero.applySuperAbility(heroes, boss);

        }
    }

    public static void start() {
        Golem golem = new Golem(1200, 40, "Extra Damage");
        Magical magical = new Magical(800, 50, "Double Damage");
        Warrior warrior = new Warrior(800, 60, "Critical Strike");
        Boss boss = new Boss(4000, 150);
        Hero[] heroes = {golem, magical, warrior};

        printStatistics(heroes, boss);

        while (!isGameOver(heroes, boss)) {
            round(heroes, boss);
            roundCounter++;
        }

    }


}
