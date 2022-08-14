package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird () {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        String stringVal1 = getNumberOfPaws() > 1 ? " paws" : " paw";
        String stringVal2 = isHasFur() ? "a fur." : "no fur.";

        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + stringVal1
                +  " and " + stringVal2 + " Moreover, it has 2 wings and can fly." ;
    }
}
