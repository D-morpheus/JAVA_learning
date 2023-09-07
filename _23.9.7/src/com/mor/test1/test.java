package com.mor.test1;

public class test {
    public static void main(String[] args) {
        Student s = new Student("zhangsan", 17);
        Teacher t = new Teacher("lisi", 17);
        Administrater a = new Administrater("wangwu", 17);

        regester(s);
        regester(t);
        regester(a);
    }

    public static void regester(Person p)
    {
        p.show();
    }
}
