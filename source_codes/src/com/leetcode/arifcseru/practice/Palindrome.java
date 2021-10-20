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
public class Palindrome {

    public static void main(String[] args) {
        boolean res = new Solution().isPalindrome(121);
        System.err.println(res);;
        System.err.println(new Solution().isPalindrome(123));;
        System.err.println(new Solution().isPalindrome(124));;
    }
}

class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reverseNumber = 0;
        while (temp > 0) {
            int lastDigit = temp % 10; // 123, 123%10 = 3, 2, 1
            temp = temp / 10;
            reverseNumber = reverseNumber * 10 + lastDigit; // 321, 
        }
        return x == reverseNumber;
    }
}
