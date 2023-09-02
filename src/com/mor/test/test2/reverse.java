package com.mor.test.test2;

public class reverse {
    public static void main(String[] args) {
        String str = "你们好";
        StringBuilder sb = new StringBuilder(str);
        String ret = sb.reverse().toString();
        System.out.println(ret);
    }
}
