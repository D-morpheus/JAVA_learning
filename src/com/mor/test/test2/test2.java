package com.mor.test.test2;

public class test2 {
    public static void main(String[] args) {
        String a = "cdeabc";
        String b = "bcdea";

        if(b.length() != a.length())
        {
            System.out.println("不同");
            System.exit(0);
        }
        boolean flag = true;
        for (int i = 0; i < a.length(); i++)
        {
            a = rotate(a);
            if(a.equals(b))
            {
                flag = false;
                System.out.println("相同");
                break;
            }
        }
        if (flag)
        {
            System.out.println("不同");
        }
    }

    /*旋转字符串*/public static String rotate(String str)
    {
        char first = str.charAt(0);
        String end = str.substring(1);
        StringBuilder sb = new StringBuilder();
        return  sb.append(end).append(first).toString();
    }

}
