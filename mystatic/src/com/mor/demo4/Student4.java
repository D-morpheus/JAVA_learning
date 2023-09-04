package com.mor.demo4;

import java.sql.SQLOutput;

public class Student4 {
    String name;
    int age;
    static String TeacherName;

    public Student4() {
    }

    public Student4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return TeacherName
     */
    public static String getTeacherName() {
        return TeacherName;
    }

    /**
     * 设置
     * @param TeacherName
     */
    public static void setTeacherName(String TeacherName) {
        Student4.TeacherName = TeacherName;
    }

    public void show()
    {
        System.out.println(name + age + TeacherName);
    }

    public static void method(Student4 stu)
    {
        stu.show();
        System.out.println("静态方法");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


}
