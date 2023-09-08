package com.mor.test2;

public class rabbit extends animal{
    public rabbit() {
    }

    public rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃胡萝卜");
    }
}
