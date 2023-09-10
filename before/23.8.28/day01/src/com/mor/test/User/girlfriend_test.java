package com.mor.test.User;

import com.mor.test.User.girlfriend;

public class girlfriend_test {
    public static void main(String[] args) {
        girlfriend gf1 = new girlfriend("yiyi", 18);
        gf1.setAge(18);



        System.out.println("年龄：" + gf1.getAge());
        System.out.println("姓名：" + gf1.getName());
    }
}
//无this：就近原则
//有this：使用成员变量