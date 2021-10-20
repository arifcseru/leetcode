/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Arifur Rahman
 */
public class _15_ThreeSumMain {

    public List<List<Integer>> threeSumOld(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> threeSumList = new ArrayList<>();
        if (nums.length == 0) {
            return threeSumList;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        List<Integer> threeSumElements = new ArrayList<>();
                        threeSumElements.add(nums[i]);
                        threeSumElements.add(nums[j]);
                        threeSumElements.add(nums[k]);
                        threeSumList.add(threeSumElements);
                    }
                }
            }
        }
        return threeSumList;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> threeSumList = new ArrayList<>();
        if (nums.length >= 0 && nums.length <= 2) {
            return threeSumList;
        }
        int totalZeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                totalZeros++;
            }
        }
        if (totalZeros == nums.length) {
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(0);
            list.add(0);
            threeSumList.add(list);
            return threeSumList;
        }
        int currentSum = 0;
        // -4 -1 -1 0 1 2
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                currentSum = nums[i] + nums[left] + nums[right];

                // System.out.print(left + ": " + nums[left] + ", " + i + ": " + nums[i] + " ," + right + ": " + nums[right] + "\n");
                // System.out.println("currentSum: " + currentSum);
                if (currentSum == 0) {
                    List<Integer> threeSumElements = new ArrayList<>();
                    threeSumElements.add(nums[i]);
                    threeSumElements.add(nums[left]);
                    threeSumElements.add(nums[right]);
                    threeSumList.add(threeSumElements);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (currentSum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return threeSumList;
    }

    public static void main(String[] args) {
        // int[] nums = {0, 0, 0};
        // int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {-2, 0, 1, 1, 2};
        // int[] nums = {-1, 0, 1};
        // -4 -1 -1 0 1 2
        List<List<Integer>> threeSumList = new _15_ThreeSumMain().threeSum(nums);
        for (List<Integer> list : threeSumList) {
            System.out.println(list);
        }
    }
}
