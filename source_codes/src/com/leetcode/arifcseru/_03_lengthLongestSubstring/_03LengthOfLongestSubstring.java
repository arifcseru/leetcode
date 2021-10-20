/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru._03_lengthLongestSubstring;

/**
 *
 * @author Arifur Rahman
 */
public class _03LengthOfLongestSubstring {

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.lengthOfLongestSubstring("abcabcdabcdabcabcabc"));
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("aab"));
        System.out.println(solution.lengthOfLongestSubstring("a"));
        System.out.println(solution.lengthOfLongestSubstring("abc"));
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
    }
}

class Solution1 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.trim().length() == 0) {
            return 1;
        } else {
            String tempSubstring = "";
            String longestSubstring = "";
            // abcabcdabcd
            for (int i = 0; i < s.length(); i++) {
                if (!tempSubstring.contains(new Character(s.charAt(i)).toString())) {
                    tempSubstring += new Character(s.charAt(i)).toString();
                    System.out.println(tempSubstring);
                } else {
                    if (tempSubstring.length() > longestSubstring.length()) {
                        longestSubstring = tempSubstring;
                    }
                    tempSubstring = "";
                    tempSubstring += new Character(s.charAt(i)).toString();
                    System.out.println(tempSubstring);
                    // i--;
                }
            }
            if (tempSubstring.length() > longestSubstring.length()) {
                longestSubstring = tempSubstring;
            }
            if (longestSubstring.length() == 0) {
                longestSubstring = s;
            }
            return longestSubstring.length();
        }
    }
}
