package com.mor.demo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){};

    public static int GetMaxAge(ArrayList<Student> list)
    {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(list.get(i).getAge(), max);
        }
        return max;
    }
}
