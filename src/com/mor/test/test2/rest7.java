package com.mor.test.test2;

import java.util.StringJoiner;

public class rest7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str = "";
        StringJoiner sj = new StringJoiner(",","[","]");
        for(int i = 0; i < arr.length; i++) {
            str = sj.add(arr[i]+"").toString();
        }
        System.out.println(str);
    }
}
