package com.company;

public class Warrior extends Hero {
    @Override
    public void ability() {
        System.out.println("Fencing");

    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        System.out.println("Warrior strikes");
        return superAbilityType;
    }
}
