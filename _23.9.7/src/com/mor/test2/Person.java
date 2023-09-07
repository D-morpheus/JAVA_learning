package com.mor.test2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal, String something){
        if(animal instanceof Dog d)
        {
            System.out.printf("年龄为%d岁的%s养了一只%s颜色的%d岁的动物\n",
                    age, name, animal.getColor(), animal.getAge());
            animal.eat(something);
            d.lookhome();
        }
    }
}
