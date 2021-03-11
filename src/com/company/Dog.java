package com.company;

public class Dog extends Animal implements soundProducable {

    @Override
    public String draw() {
        return "\uD83D\uDC36";

    }

    @Override
    public String callSound() {
        return "Гав Гав ";
    }
}
