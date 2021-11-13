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
public class _136_SingleNumber {

    public int singleNumber_timeLimitExeed(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int singleNumber = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (map.containsKey(val)) {
                int counter = map.get(val);
                map.put(val, counter + 1);
                for (Integer integer : map.keySet()) {
                    if (map.get(integer) == 1) {
                        singleNumber = integer;
                    }
                }
            } else {
                singleNumber = val;
                map.put(val, 1);
            }
        }
        return singleNumber;
    }

    public int singleNumber(int[] nums) {
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
        Integer val = (Integer)vals[0];
        return val.intValue();
    }

    public static void main(String[] args) {
        // int[] nums = {2, 2, 1};
        int[] nums = {4, 1, 2, 1, 2};
        // int[] nums = {1};
        System.out.println(new _136_SingleNumber().singleNumber(nums));
    }
}
