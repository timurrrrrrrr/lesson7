package com.company;

public class Main {

    public static void main(String[] args) {

        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        System.out.println("---------------");

        HavingSuperAbility [] heroes = {new Magic(),new Medic(),new Warrior()};
        for (int i = 0; i <heroes.length ; i++) {
            System.out.println("------------");
            heroes[i].ability();
            heroes[i].applySuperAbility("");




        }
	// write your code here
    }
}
