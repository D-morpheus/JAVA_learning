package com.mor.test5;

public class BasCoach extends Coach{
    @Override
    public void Teach() {
        System.out.println("教打篮球");
    }

    public BasCoach() {
    }

    public BasCoach(String name, int age) {
        super(name, age);
    }
}
