package com.mor.demo1;


public class Student_test {

    public static void main(String[] args) {
        Student.setTeacherName("阿伟老师");

        Student s1 = new Student("zhangsan", 23, "男");

        s1.study();
        s1.show();

        Student s2 = new Student("lisi", 24, "女");

        s2.study();
        s2.show();

    }

}
