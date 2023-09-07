package com.mor.test1;

public class Teacher extends Person{
    @Override
    public  void show()
    {
        System.out.println("老师的信息为：");
        super.show();
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
}
