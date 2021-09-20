package com.company;

public class Medic extends Hero {
    @Override
    public void ability() {
        System.out.println("Treatment");


    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        System.out.println("Medical Assistance");

        return superAbilityType;
    }
}
