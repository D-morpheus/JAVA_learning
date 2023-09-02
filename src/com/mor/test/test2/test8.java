package com.mor.test.test2;

public class test8 {
    public static void main(String[] args) {
        String str = "JavaJava语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        int count = 0;
        System.out.println(str.indexOf("Java"));
        for (int i = 0; i < str.length(); ) {
            int ret = str.indexOf("Java");
            str = str.substring(ret + 4);
            if (ret != -1) {
                count++;
                i += 3;
            } else {
                break;
            }
        }
        System.out.println(count);

    }
}
