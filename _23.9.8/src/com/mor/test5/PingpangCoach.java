package com.mor.test5;

public class PingpangCoach extends Coach implements English{
    @Override
    public void Teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void speakEng() {
        System.out.println("乒乓球教练说英语");
    }

    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }
}
