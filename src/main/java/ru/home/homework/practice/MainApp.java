package ru.home.homework.practice;

import ru.home.homework.practice.units.Hero;
import ru.home.homework.practice.units.Monster;
import ru.home.homework.practice.units.Unit;

public class MainApp {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero", 10);
        Monster monster = new Monster("Monster", 5);


        hero.info();
        monster.info();
        hero.attackEnemy(monster);
        monster.info();
        monster.attackEnemy(hero);
        hero.info();

    }
}
