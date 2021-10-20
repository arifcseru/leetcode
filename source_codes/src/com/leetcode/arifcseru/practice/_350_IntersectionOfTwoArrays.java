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
public class _350_IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> commons = new ArrayList<Integer>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                commons.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] array = new int[commons.size()];
        int k = 0;
        for (Integer common : commons) {
            array[k] = common;
            k++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums1 = {9, 4, 9, 8, 4};
        int[] nums2 = {4, 9, 5};
        int[] res = new _350_IntersectionOfTwoArrays().intersect(nums1, nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(" " + res[i]);
        }
    }
}
