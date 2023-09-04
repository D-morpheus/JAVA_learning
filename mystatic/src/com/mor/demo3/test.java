package com.mor.demo3;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("zhangsan", 23, "男");
        Student stu2 = new Student("lisi", 24, "女");
        Student stu3 = new Student("wangwu", 25, "男");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int max = StudentUtil.GetMaxAge(list);
        System.out.println(max);
    }
}
