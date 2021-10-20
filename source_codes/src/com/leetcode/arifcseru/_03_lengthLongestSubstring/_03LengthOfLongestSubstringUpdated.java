/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru._03_lengthLongestSubstring;

import java.util.HashSet;

/**
 *
 * @author Arifur Rahman
 */
public class _03LengthOfLongestSubstringUpdated {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcdabcdabcabcabc"));
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("aab"));
        System.out.println(solution.lengthOfLongestSubstring("a"));
        System.out.println(solution.lengthOfLongestSubstring("abc"));
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
    }
}

class Solution {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0, j = 0;
        HashSet<Character> hashSet = new HashSet();
        while (j < s.length()) {
            if (!hashSet.contains(s.charAt(j))) {
                hashSet.add(s.charAt(j));
                j++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
