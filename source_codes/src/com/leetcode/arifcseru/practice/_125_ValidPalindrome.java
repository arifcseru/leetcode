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
public class _125_ValidPalindrome {

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            Character ci = s.charAt(i);
            // System.out.println("i: " + i + ", j:" + j);
            while (!Character.isLetterOrDigit(ci)) {

                i++;
                if (i < s.length()) {
                    ci = s.charAt(i);
                } else {
                    break;
                }

            }
            Character cj = s.charAt(j);
            while (!Character.isLetterOrDigit(cj)) {
                // System.out.println("j: " + j + ", i:" + i);
                j--;
                if (j > -1) {
                    cj = s.charAt(j);
                } else {
                    break;
                }
            }

            if (Character.isLetterOrDigit(ci)
                    && Character.toLowerCase(ci) != Character.toLowerCase(cj)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(new _125_ValidPalindrome().isPalindrome(s));
        s = "racecar";
        System.out.println(new _125_ValidPalindrome().isPalindrome(s));
        s = "race a car";
        System.out.println(new _125_ValidPalindrome().isPalindrome(s));
        s = ".,";
        System.out.println(new _125_ValidPalindrome().isPalindrome(s));
        s = " ";
        System.out.println(new _125_ValidPalindrome().isPalindrome(s));
    }
}
