package com.mor.test.test2;

public class test5 {
    public static void main(String[] args) {
        String num1 = "1234";
        String num2 = "4321";

        System.out.println(StrToNum(num1));
        int ret = StrToNum(num1) * StrToNum(num2);

        String result = ret + "";
        System.out.println(result);
    }
    public static int StrToNum(String str)
    {
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            n = n * 10 + str.charAt(i) - '0';
        }
        return n;
    }
}
