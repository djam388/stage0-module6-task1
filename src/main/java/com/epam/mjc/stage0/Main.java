package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird.getDescription());

        System.out.println(new Dog().getDescription());
    }
}
