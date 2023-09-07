package com.mor.test2;

import com.mor.test2.Person;

public class test {
    public static void main(String[] args) {
        Person p = new Person("老王", 18);

        Animal d = new Dog(3, "红");
        p.keepPet(d, "骨头");

    }

}
