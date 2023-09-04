package com.mor.demo4;
//静态：共享
public class test4 {
    public static void main(String[] args) {
        Student4.TeacherName = "阿伟老师";

        Student4 s1 = new Student4("zhangsan", 23);
        s1.show();

        System.out.println("-----------------------");

        Student4 s2 = new Student4("zhangsan", 23);

        Student4.method(s2);



    }
}
