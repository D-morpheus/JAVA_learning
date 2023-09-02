package com.mor.test.test2;

public class tset9 {
    public static void main(String[] args) {
        String str = "JavaJava语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        String tar = "java";
        String str2 = str.replace("Java", "");
        System.out.println((str.length() - str2.length()) / tar.length());
    }
}
