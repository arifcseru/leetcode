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
public class _191_NumberOfOneBits {

    public int hammingWeight(int n) {
        int totalHammingBits = 0;

        int count = 0;
        while (count < 32) {
            int num = n & 1;
            if (num > 0) {
                totalHammingBits += 1;
            }
            count++;
            n = n >>> 1;
        }

        return totalHammingBits;
    }

    public static void main(String[] args) {
        System.out.println(new _191_NumberOfOneBits().hammingWeight(5));
        System.out.println(new _191_NumberOfOneBits().hammingWeight(2));
        System.out.println(new _191_NumberOfOneBits().hammingWeight(4));
    }
}
