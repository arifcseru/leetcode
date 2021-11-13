/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Arifur Rahman
 */
public class _26_RemoveDuplicates {

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

    public int removeDuplicatesOld(int[] nums) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            // System.out.print(" " + nums[i]);
            if (i < nums.length - 1 && nums[i] != nums[i + 1]) {
                nums[j] = nums[i];
                nums[i] = nums[i + 1];
                j++;
            }
            i++;
        }
        return j;
    }

    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int k = 0; k < nums.length; k++) {
            set.add(nums[k]);
        }
        int i = 0;
        for (Integer integer : set) {
            nums[i++] = integer;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        // int[] nums = {1, 1, 2};
        int res = new _26_RemoveDuplicates().removeDuplicates(nums);
        System.out.println();
        System.out.println(res);

        for (int i = 0; i <= res; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
