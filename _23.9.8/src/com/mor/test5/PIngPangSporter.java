package com.mor.test5;

public class PIngPangSporter extends Sporter implements English{
    @Override
    public void study() {
        System.out.println("学打乒乓");
    }

    @Override
    public void speakEng() {
        System.out.println("乒乓球运动员说英语");
    }

    public PIngPangSporter() {
    }

    public PIngPangSporter(String name, int age) {
        super(name, age);
    }
}
