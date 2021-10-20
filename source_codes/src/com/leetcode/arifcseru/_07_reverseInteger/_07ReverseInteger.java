/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru._07_reverseInteger;

/**
 *
 * @author Arifur Rahman
 */
public class _07ReverseInteger {

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(1534236469)); // 2147483647
        System.out.println(new Solution().reverse(-1534236469)); // 2147483647
        System.out.println(new Solution().reverse(210));
        System.out.println(new Solution().reverse(-012));
        System.out.println(new Solution().reverse(-21));
        System.out.println(new Solution().reverse(-120));
    }
}
// 12345 => 54321

class Solution {

    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            x = -1 * x;
            isNegative = true;
        }
        int temp = x;
        long reverse = 0;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            return x;
        }
        return (int) (isNegative ? -reverse : reverse);
    }
}
