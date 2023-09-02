package com.mor.test.test2;

public class test6 {
    public static void main(String[] args) {
        String str = "hello my name is qwertyuio";
        System.out.println(count(str));

    }
    public static int count(String str)
    {
        int count = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) != ' ')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}
