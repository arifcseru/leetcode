/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.Arrays;

/**
 *
 * @author Arifur Rahman
 */
public class _27_RemoveElementMain {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            System.out.print(" " + nums[i]);
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }

    public static void main(String[] args) {
        // int[] nums = {3, 2, 2, 3};
        int[] nums = {3, 3, 4, 5, 3, 34, 5, 6, 77, 3};
        int res = new _27_RemoveElementMain().removeElement(nums, 3);
        System.out.println();
        System.out.println(res);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
