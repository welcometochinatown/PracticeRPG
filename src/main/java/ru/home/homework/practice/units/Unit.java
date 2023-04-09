package ru.home.homework.practice.units;

public class Unit {
    String name;
    int hitPoints;
    int attackPower;
    double criticalChance;
    double evasionChance;

    public boolean isAlive() {
        if (hitPoints > 0) {
            return true;
        }
        return false;
    }

    public void attackEnemy(Unit unit) {
        if (isAlive()) {
            unit.hitPoints -= this.attackPower;
        } else {
            System.out.println("Ваш противник мертв");
        }
    }

    public void info() {
        System.out.println(name + " имеет " + hitPoints + " hp. ");
    }
}
