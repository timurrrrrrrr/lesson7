package com.company;

public class Magic extends Hero implements  HavingSuperAbility {
    @Override
    public void ability() {
        System.out.println("Magical");

    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        System.out.println("Magical Applied Fireball");

        return superAbilityType;
    }

    public void magicalDamage(){
        System.out.println("Маг нанес критический урон!!!");
    }
}
