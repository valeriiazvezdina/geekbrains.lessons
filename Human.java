package ru.geekbrains.lesson1;

public class Human implements Actions {

    private String name;

    public Human (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Override
    public void run (int n) {
        System.out.println(getName() + " has run " + n + " metres!");
    }

    @Override
    public void jump (int n) {
        System.out.println(getName() + " has jumped " + n + " metres!");
    }

}
