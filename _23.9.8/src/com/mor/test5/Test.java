package com.mor.test5;

public class Test {
    public static void main(String[] args) {
        PIngPangSporter pps = new PIngPangSporter("zhangsan", 17);
        System.out.println(pps.getName()+","+pps.getAge());
        pps.study();
        pps.speakEng();
    }

}
