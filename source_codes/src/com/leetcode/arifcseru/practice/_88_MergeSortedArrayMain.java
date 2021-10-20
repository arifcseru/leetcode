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
public class _88_MergeSortedArrayMain {

    public void mergeOld(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        System.out.println("Nums2 Length: " + nums2.length);
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2.length - 1; j++) {
                boolean isGreater = nums1[i] >= nums2[j];
                System.out.println("i:" + nums1[i] + " >= " + nums2[j] + " " + isGreater);
                if (isGreater) {
                    System.out.println("Hello");
                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums1[nums2.length + k] = temp;
                }
            }

        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        new _88_MergeSortedArrayMain().merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(" " + nums1[i]);
        }

    }
}
