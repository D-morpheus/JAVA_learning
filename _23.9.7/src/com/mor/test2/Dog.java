package com.mor.test2;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something)
    {
        System.out.printf("%d岁的%s颜色的狗两只前腿死死的抱住%s猛吃\n", getAge(), getColor(), something);
    }

    public void lookhome()
    {
        System.out.println("狗在看家");
    }
}
