package com.mor.test.test2;

public class test2case2 {
    public static void main(String[] args) {
        String a = "deabc";
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
            System.out.println(a);
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
        char[] arr = str.toCharArray();
        char first = str.charAt(0);
        for (int i = 0; i < str.length()-1; i++) {
            arr[i] = str.charAt(i + 1);
        }
        arr[str.length()-1] = str.charAt(0);
        return new String(arr);

    }

}
