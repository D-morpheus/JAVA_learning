package com.mor.test6;

public class test_6 {
    public static void main(String[] args) {


        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写了游泳方法");
            }
        };
    }
}
