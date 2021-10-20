/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru._04_medianSortedArrays;

import java.util.Arrays;

/**
 *
 * @author Arifur Rahman
 */
public class _04MedianSortedArrays {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2}, nums2 = {3,4,5,6,7,8};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
}

class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int fal = nums1.length;        //determines length of firstArray  
        int sal = nums2.length;   //determines length of secondArray  
        int[] result = new int[fal + sal];  //resultant array of size first array and second array  
        System.arraycopy(nums1, 0, result, 0, fal);
        System.arraycopy(nums2, 0, result, fal, sal);
        System.out.println(Arrays.toString(result));
        double median = 0;
        if (result.length % 2 == 0) {
            int res1 = result[(result.length / 2)-1];
            int res2 = result[(result.length / 2)];
            System.out.println(res1 + "->" + res2);
            median = (double)(res1 + res2) / 2;
        } else {
            median = result[result.length / 2];
        }
        
        return median;
    }
    public double findMedianSortedArraysOld(int[] nums1, int[] nums2) {
        int fal = nums1.length;        //determines length of firstArray  
        int sal = nums2.length;   //determines length of secondArray  
        int[] result = new int[fal + sal];  //resultant array of size first array and second array  
        System.arraycopy(nums1, 0, result, 0, fal);
        System.arraycopy(nums2, 0, result, fal, sal);
        System.out.println(Arrays.toString(result));
        double median = 0;
        if (result.length % 2 == 0) {
            int res1 = result[(result.length / 2)-1];
            int res2 = result[(result.length / 2)];
            System.out.println(res1 + "->" + res2);
            median = (double)(res1 + res2) / 2;
        } else {
            median = result[result.length / 2];
        }
        
        return median;
    }
}
