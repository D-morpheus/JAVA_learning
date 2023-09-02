package com.mor.test.test2;

public class test4 {
    public static void main(String[] args) {
        char[] arr = new char[52];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char)('a' + i);
        }

        for (int i = 26; i < 52; i++) {
            arr[i] = (char)('A' + i - 26);
        }
        System.out.println(new String(arr));
    }
}
