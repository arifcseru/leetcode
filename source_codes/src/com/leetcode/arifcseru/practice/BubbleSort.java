/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

/**
 *
 * @author Arifur Rahman
 */
public class BubbleSort {

    public void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                System.out.println(i + ". nums[j]:" + nums[j] + ", nums[j+1]: " + nums[j + 1]);
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.println("After pass:" + i);
            for (int k = 0; k < nums.length; k++) {
                System.out.print(nums[k] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[] nums = {9, 4, -4, 3, 0, 3, 5};
        // int[] nums = {9, 4, -4, 3, 0, 3, 5};
        // int[] nums = {7, 6, 5, 4, 3, 2, 1};

        new BubbleSort().sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
