package com.mor;

public class demo5
{


    //定义接口
    interface InterA {
        void showA();
    }

     class A {
        public void methodA(InterA a) {
            a.showA();
        }
    }
}
