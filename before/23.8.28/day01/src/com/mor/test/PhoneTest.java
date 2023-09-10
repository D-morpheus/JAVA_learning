package com.mor.test;

public class PhoneTest
{
    public static void main(String[] args)
    {
        Phone p = new Phone();
        //赋值
        p.brand = "小米";
        p.price = 1999.98;

        //获取值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用方法
        p.call();
        p.playgame();
    }

}
