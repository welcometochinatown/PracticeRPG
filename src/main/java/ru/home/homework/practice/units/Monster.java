package ru.home.homework.practice.units;

public class Monster extends Unit {
    public Monster(String name, int attackPower) {
        this.name = name;
        hitPoints = 100;
        this.attackPower = attackPower;
        criticalChance = Math.random();
        evasionChance = Math.random();
    }
}
