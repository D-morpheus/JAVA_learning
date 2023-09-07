package com.mor.test1;

public class Administrater extends Person{
    @Override
    public void show()
    {
        System.out.println("管理员的信息为：");
        super.show();
    }

    public Administrater() {
    }

    public Administrater(String name, int age) {
        super(name, age);
    }
}
