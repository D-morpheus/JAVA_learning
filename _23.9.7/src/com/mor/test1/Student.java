package com.mor.test1;

public class Student extends  Person{
    @Override
    public  void show()
    {
        System.out.println("学生的信息为：");
        super.show();
    }

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
