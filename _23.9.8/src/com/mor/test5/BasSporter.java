package com.mor.test5;

public class BasSporter extends Sporter{
    @Override
    public void study() {
        System.out.println("学如何打篮球");
    }

    public BasSporter() {
    }

    public BasSporter(String name, int age) {
        super(name, age);
    }
}
