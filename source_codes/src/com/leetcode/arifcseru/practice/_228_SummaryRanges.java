/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class _228_SummaryRanges {
// 0,2,3,4,6,8,9

    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String prep = String.valueOf(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == 1) {
                    prep += "->";
                    while (j < nums.length && i < nums.length && nums[j] - nums[i] == 1) {
                        i++;
                        j++;
                    }
                    prep += String.valueOf(nums[j-1]);

                }
            }
            list.add(prep);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> values = new _228_SummaryRanges().summaryRanges(nums);
        System.out.println(values);
    }
}
