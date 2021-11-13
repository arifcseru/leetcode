/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Arifur Rahman
 */
public class _349_IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> finalSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    finalSet.add(nums1[i]);
                    break;
                }
            }
        }
        Object[] vals = finalSet.toArray();
        int[] finalArr = new int[vals.length];
        for (int i = 0; i < vals.length; i++) {
            finalArr[i] = (Integer) vals[i];
        }
        return finalArr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3,3, 4};
        int[] nums2 = {3,4};
        int[] res = new _349_IntersectionOfTwoArrays().intersection(nums1, nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
