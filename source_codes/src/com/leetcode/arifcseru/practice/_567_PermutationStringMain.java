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
public class _567_PermutationStringMain {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Alphabetics = new int[26];
        int[] s2Alphabetics = new int[26];
        int left = 0, right = 0;
        while (right < s1.length()) {
            s1Alphabetics[s1.charAt(right) - 'a'] = s1Alphabetics[s1.charAt(right) - 'a'] + 1;
            s2Alphabetics[s2.charAt(right) - 'a'] = s2Alphabetics[s2.charAt(right) - 'a'] + 1;
            right++;
        }
        right--;
        while (right < s2.length()) {
            if (hasAnagram(s1Alphabetics, s2Alphabetics)) {
                return true;
            }
            right++;
            s2Alphabetics[s2.charAt(right) - 'a']++;
            s2Alphabetics[s2.charAt(left) - 'a']--;
            left ++;

        }

        return false;
    }

    private boolean hasAnagram(int[] alphabetsOfS1, int[] alphabetsOfS2) {
        for (int i = 0; i < 26; i++) {
            if (alphabetsOfS1[i] > alphabetsOfS2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean res = new _567_PermutationStringMain().checkInclusion(s1, s2);
        System.out.println(res);
    }
}
