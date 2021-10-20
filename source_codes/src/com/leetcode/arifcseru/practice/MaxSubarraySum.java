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
public class MaxSubarraySum {

    int maxSubArraySum(int[] nums) {
        int n = nums.length;
        int maximumSubArraySum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int left = 0; left < n; left++) {

            int runningWindowSum = 0;

            for (int right = left; right < n; right++) {
                runningWindowSum += nums[right];

                if (runningWindowSum > maximumSubArraySum) {
                    maximumSubArraySum = runningWindowSum;
                    start = left;
                    end = right;
                }
            }
        }
        return maximumSubArraySum;
    }

    public static void main(String[] args) {
        // int[] nums = {1, 2, -1, 4, 5, -5, -3, 9, 3, -5};
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = new MaxSubarraySum().maxSubArraySum(nums);
        System.out.println(res);
    }
}
