package com.mor.demo1;

public class test {
    public static void main(String[] args) {

        NewPhone n = new NewPhone();
        OldPhone o = new OldPhone();
        usePhone(o);
        usePhone(n);

    }
    public static void usePhone(Phone p)
    {
        p.call();
        p.message();
        if (p instanceof NewPhone n) {
            n.game();
        }
    }
}
