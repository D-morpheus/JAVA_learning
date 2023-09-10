package com.mor.test.User;

public class girlfriend
{
    int num;

    private String name;
    private int age;

    public girlfriend(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public()
    public String getName()
    {
        return name;
    }


    public void setAge(int a)
    {
        if(a >= 18 && a <= 24)
        {
            age = a;
        }
        else
        {
            System.out.println("年龄不合适");
        }
    }

    public int getAge()
    {
        return age;
    }
}
