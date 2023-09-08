package com.mor.demo2;

public class Phone extends Fun implements iPlay{
    @Override
    public void playGame() {
        System.out.println("创建对象在玩游戏");
    }

    @Override
    public void fun() {
        System.out.println("创建对象在fun");
    }
}
