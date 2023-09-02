package com.mor.test.test3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Student s1 = null;
        for (int i = 0; i < 3; i++) {
            s1 = new Student();
            System.out.println("请输入学生姓名");
            s1.setName(sc.next());
            System.out.println("请输入学生年龄");
            s1.setAge(sc.nextInt());
            list.add(s1);
        }

//        Student s2 = new Student("lisi", 19);
//        Student s3 = new Student("wangwu", 20);

//        list.add(s2);
//        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + stu.getAge());
        }
    }
}
