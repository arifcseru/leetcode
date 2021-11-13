/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Arifur Rahman
 */
public class _260_SingleNumber3 {

    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (set.contains(val)) {
                set.remove(val);
            } else {
                set.add(val);
            }
        }
        Object[] vals = set.toArray();
        int[] valsInt = new int[vals.length];
        for (int i = 0; i < vals.length; i++) {
            valsInt[i] = (Integer) vals[i];
        }
        return valsInt;
    }

    public static void main(String[] args) {
        // int[] nums = {2, 2, 1};
        int[] nums1 = {1, 2, 1, 3, 2, 5};
        int[] nums2 = {-1,0};
        int[] nums3 = {0,1};
        // int[] nums = {1};
        System.out.println(new _260_SingleNumber3().singleNumber(nums1).length);
        System.out.println(new _260_SingleNumber3().singleNumber(nums2).length);
        System.out.println(new _260_SingleNumber3().singleNumber(nums3).length);
    }
}
