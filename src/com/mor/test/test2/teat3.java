package com.mor.test.test2;

import java.util.Random;
import java.util.Scanner;

public class teat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(change(str));


    }
    public static String change(String str)
    {
        char[] arr = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < str.length(); i++) {
            int t = r.nextInt(arr.length - 1);
            char tmp = arr[i];
            arr[i] = arr[t];
            arr[t] = tmp;
        }

        return new String(arr);

    }
}
