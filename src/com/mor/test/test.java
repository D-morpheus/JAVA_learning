package com.mor.test;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < nums.length; i++) {
            int index = r.nextInt(nums.length);
            int tmp = nums[i];
            nums[i] = nums[index];
            nums[index] = tmp;
        }
        //遍历nums
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }

        int[][] data = new int[4][4];

        for (int i = 0; i < nums.length; i++) {
            data[i / 4][i % 4] = nums[i];
        }

    }
}
