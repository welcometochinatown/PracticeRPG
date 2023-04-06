package ru.home.homework.practice;

import ru.home.homework.practice.units.Hero;
import ru.home.homework.practice.units.Monster;
import ru.home.homework.practice.units.Unit;

public class MainApp {
    public static void main(String[] args) {


        new Hero("Hero", 10);
        new Monster("Monster", 5);

        while(Hero.isAlive() && Monster.isAlive()) {
            Hero.attackEnemy();
            Hero.info();
            Monster.attackEnemy();
            Monster.info();
        }
    }
}
