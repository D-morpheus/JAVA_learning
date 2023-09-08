package com.mor.demo1;

public class NewPhone extends Phone implements Game{

    public NewPhone() {
    }

    @Override
    public void game() {
        System.out.println("玩游戏");
    }
}
