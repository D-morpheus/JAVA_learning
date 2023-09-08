package com.mor.demo10;

public class Test {
    public static void main(String[] args) {
        com.mor.demo10.B b = new com.mor.demo10.B(new com.mor.demo10.InterB() {
            @Override
            public void showB() {
                System.out.println("匿名内部类调用showB");
            }
        });
        b.methodB();

    }
}
