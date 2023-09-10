package com.mor.test;

import java.util.Random;

public class Test2
{
    public static void main(String[] args)
    {
        char[] chs = new char[52];
        for(int i = 0; i < chs.length; i++)
        {
            if(i <= 25)
            {
                chs[i] = (char)(97 + i);
            }
            else
            {
                chs[i] = (char)(65 + i - 26);
            }
        }
//        for(int i = 0; i < chs.length; i++)
//        {
//            System.out.println(chs[i] + " ");
//        }
        String result = "";
        Random r = new Random();
        for(int i = 0; i < 4; i++)
        {
            int ran = r.nextInt(chs.length);
            result += chs[ran];
        }

        int num = r.nextInt(10);
        result += num;
        System.out.println(result);

    }
}
