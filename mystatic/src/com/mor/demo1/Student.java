package com.mor.demo1;

public class Student {
    private String name;
    private int age;
    private String gender;

    private static String TeacherName;

    public static String getTeacherName() {
        return TeacherName;
    }

    public static void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){
        System.out.println(name+"正在学习");
    }
    public void show(){
        System.out.println(name + "," + age+ "," + gender  +","+TeacherName);
    }
}
