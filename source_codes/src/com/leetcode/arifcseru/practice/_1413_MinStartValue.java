/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

/**
 *
 * @author User
 */
public class _1413_MinStartValue {

    public int minStartValue(int[] nums) {
        int chosenNumber = 1;
        while (true) {
            int totalChecked = 0;
            int res = chosenNumber + nums[0];
            if (res > 0) {
                for (int i = 1; i < nums.length; i++) {
                    res = nums[i] + res;
                    System.out.println("chosenNumber + nums[i]: " + res);
                    if (res < 1) {
                        System.out.println("break for: " + chosenNumber);
                        break;
                    } else {
                        totalChecked++;
                    }
                }
            }

            System.out.println("totalChecked: " + totalChecked);
            System.out.println("nums.length: " + nums.length);
            if (totalChecked >= nums.length - 1) {
                return chosenNumber;
            }
            chosenNumber++;
        }

    }

    public static void main(String[] args) {
        // int[] nums = {-3, 2, -3, 4, 2};
        int[] nums = {-3, 6, 2, 5, 8, 6};
        System.out.println(new _1413_MinStartValue().minStartValue(nums));
    }
}
