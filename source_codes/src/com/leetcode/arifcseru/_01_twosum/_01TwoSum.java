/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru._01_twosum;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Arifur Rahman
 */
public class _01TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        _01TwoSum solution = new _01TwoSum();
        int[] nums = {2,7,11,15};
        
        System.out.println(solution.twoSum(nums, 9)[0] + "," + solution.twoSum(nums, 9)[1]);
    }

}
