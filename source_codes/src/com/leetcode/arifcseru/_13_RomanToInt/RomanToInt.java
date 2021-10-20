/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru._13_RomanToInt;

/**
 *
 * @author Arifur Rahman
 */
public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("IV"));
    }
}

class Solution {

    public int romanToInt(String s) {
        int finalNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                finalNumber += 1;
            } else if (s.charAt(i) == 'V') {
                finalNumber += 5;
            } else if (s.charAt(i) == 'X') {
                finalNumber += 10;
            } else if (s.charAt(i) == 'L') {
                finalNumber += 50;
            } else if (s.charAt(i) == 'C') {
                finalNumber += 100;
            } else if (s.charAt(i) == 'D') {
                finalNumber += 500;
            } else if (s.charAt(i) == 'M') {
                finalNumber += 1000;
            }
        }
        return finalNumber;
    }
}
