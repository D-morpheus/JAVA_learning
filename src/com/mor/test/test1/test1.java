package com.mor.test.test1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";

        while (true) {
            System.out.println("请输入一串字符串:");
            str = sc.next();
            if(numcheck(str))
            {
                break;
            }
            else
            {
                System.out.println("字符串不符合规范，请重新输入：");
            }
        }
        System.out.println(change(str));

    }

    public static String change(String str)
    {
        String[] arr = {"","一","二","三","四","五","六","七","八","九"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(arr[str.charAt(i) - '0']);
        }
        return sb.toString();
    }

    public static boolean numcheck(String str)
    {
        if(str.length() <= 9)
        {

        }
        else
        {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
