package com.mor.test.test3;

import java.util.ArrayList;

public class User_teat1 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("heima001", "zhangsan", "123456");
        User u2 = new User("heima002", "lisi", "123456");
        User u3 = new User("heima003", "wangwu", "123456");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(check(list, "heima001"));
    }

    public static int check(ArrayList<User> list, String id)
    {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id))
            {
                return i;
            }
        }
        return -1;
    }

}
