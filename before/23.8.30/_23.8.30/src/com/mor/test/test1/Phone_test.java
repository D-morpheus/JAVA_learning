package com.mor.test.test1;

public class Phone_test
{
    public static void main(String[] args)
    {
        Phone mi1 = new Phone("小米手机", 3998, "黑色");
        mi1.sendMessage();
        mi1.call();
    }
}
