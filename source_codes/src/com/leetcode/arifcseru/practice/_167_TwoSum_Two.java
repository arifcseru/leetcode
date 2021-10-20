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
public class _167_TwoSum_Two {

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if ((numbers[i] + numbers[j]) == target && i != j) {
                    if (i > j) {
                        return new int[]{j + 1, i + 1};
                    } else {
                        return new int[]{i + 1, j + 1};
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // int[] numbers = {2, 4, 5, 6, 7};
        int[] numbers = {2, 3, 4};
        int target = 6;
        System.out.println(new _167_TwoSum_Two().twoSum(numbers, target)[0] + " " + new _167_TwoSum_Two().twoSum(numbers, target)[1]);
    }
}
