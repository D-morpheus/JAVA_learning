package com.mor.test5;

public abstract class Coach extends Person{
    public abstract void Teach();

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
}
