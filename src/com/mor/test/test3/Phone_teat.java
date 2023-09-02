package com.mor.test.test3;

import java.util.ArrayList;

public class Phone_teat {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("xiaomi", 1000);
        Phone p2 = new Phone("apple", 8000);
        Phone p3 = new Phone("chuizi", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> Phonelist = getPhone(list);

        for (int i = 0; i < Phonelist.size(); i++) {
            System.out.println(Phonelist.get(i).getBrand() + Phonelist.get(i).getPrice());
        }


    }
    public static ArrayList<Phone> getPhone(ArrayList<Phone> list)
    {
        ArrayList<Phone> ret = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() < 3000)
            {
                ret.add(list.get(i));
            }
        }
        return ret;
    }
}
