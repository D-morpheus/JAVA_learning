package com.mor.demo2;

public class test {
    public static void main(String[] args) {

        Phone p = new Phone();
        p.playGame();
        p.fun();

        new iPlay() {
            @Override
            public void playGame() {
                System.out.println("匿名内部类在玩手机");
            }
        }.playGame();

        new Fun() {
            @Override
            public void fun()
            {
                System.out.println("匿名内部类在fun");
            }

        }.fun();
    }
}
