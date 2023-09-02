package com.mor.test.test3;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class listdemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hi");
        list.add("你好");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1)
            {
                System.out.println(list.get(i) + "]");
            }
            else
            {
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}
