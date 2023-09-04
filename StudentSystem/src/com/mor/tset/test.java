package com.mor.tset;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        System.out.println(Captcha_generate());

    }
    /*验证码生成*/public static String Captcha_generate()
    {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        char[] Cha = new char[52];

        for (int i = 0; i < 26; i++) {
            Cha[i] =(char)('a' + i);
        }
        for (int i = 26; i < 52; i++) {
            Cha[i] =(char)('A' + i - 26);
        }
        for (int i = 0; i < 4; i++) {
            sb.append(Cha[r.nextInt(52)]);
        }

        sb.append(r.nextInt(10));


        char[] arr = sb.toString().toCharArray();

        int rindex = r.nextInt(arr.length);
        char tmp = arr[arr.length - 1];

        arr[arr.length - 1] = arr[rindex];

        arr[rindex] = tmp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return new String(arr);
    }
}
