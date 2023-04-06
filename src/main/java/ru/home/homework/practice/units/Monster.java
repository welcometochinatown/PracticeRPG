package ru.home.homework.practice.units;

public class Monster {
    private static String name;
    private static int hitPoints;
    private static int attackPower;
    private double critChance;
    private double evasionChance;

    public Monster(String name, int attackPower) {
        this.name = name;
        hitPoints = 100;
        this.attackPower = attackPower;
        critChance = Math.random();
        evasionChance = Math.random();
    }

    public static boolean isAlive() {
        if (hitPoints > 0) {
            return true;
        }
        return false;
    }

    public static void attackEnemy() {
        if (isAlive()) {
            hitPoints -= attackPower;
        } else {
            System.out.println("Ваш противник мертв");
        }
    }

    public static void info() {
        System.out.println(name + " имеет " + hitPoints + " hp. ");
    }
}
