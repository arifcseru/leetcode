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
public class _58_LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] strs = s.split(" ");
        return strs[strs.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(new _58_LengthOfLastWord().lengthOfLastWord("Hello World"));
        System.out.println(new _58_LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(new _58_LengthOfLastWord().lengthOfLastWord("luffy is still joyboy"));
    }
}
