package com.mor.demo1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.next();
    }
}

class fu{
    private int a = 0x111;
    private int b = 0x222;

    public void fuShow1()
    {
        System.out.println("public fushow1");
    }

    private void fuShow2()
    {
        System.out.println("private fushow2");
    }
}

class zi{
    int c = 0x333;
    public void ziShow()
    {
        System.out.println("public zishow");
    }
}