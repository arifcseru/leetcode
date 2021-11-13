/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Arifur Rahman
 */
public class _389_FindTheDifference {

    public char findTheDifference(String s, String t) {
        int[] sChars = new int[26];
        int[] tChars = new int[26];
        char c = 0;
        for (int i = 0; i < s.length(); i++) {
            sChars[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tChars[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < tChars.length; i++) {
            if (tChars[i] != sChars[i]) {
                c = (char) (i + 'a');
                break;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        System.out.println(new _389_FindTheDifference().findTheDifference("ae", "aae"));
        System.out.println(new _389_FindTheDifference().findTheDifference("", "y"));
        System.out.println(new _389_FindTheDifference().findTheDifference("abcd", "abcde"));
    }
}
