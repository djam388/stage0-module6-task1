package com.epam.mjc.stage0;

public class Dog extends Animal {

    public Dog() {
        super("brown", 4, true);
    }

    @Override
    public String getDescription() {
        String stringVal1 = getNumberOfPaws() > 1 ? " paws" : " paw";
        String stringVal2 = isHasFur() ? "a fur." : "no fur.";

        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + stringVal1
                +  " and " + stringVal2;
    }
}
