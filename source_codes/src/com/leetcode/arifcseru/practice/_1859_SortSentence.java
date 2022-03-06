/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

/**
 *
 * @author User
 */
public class _1859_SortSentence {

    public String sortSentence(String s) {
        StringBuilder sorted = new StringBuilder();
        String[] strs = s.split(" ");
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = 0; j < strs.length - i - 1; j++) {

                String jstr = strs[j];
                Integer jval = Integer.valueOf((jstr.substring(jstr.length() - 1, jstr.length())));

                String jjstr = strs[j + 1];
                Integer jjval = Integer.valueOf((jjstr.substring(jjstr.length() - 1, jjstr.length())));
                if (jval > jjval) {
                    strs[j] = strs[j+1];
                    strs[j+1] = jstr;
                }
            }
        }
        for (int i = 0; i < strs.length; i++) {
            String istr = strs[i];
            String jjval = (istr.substring(0, istr.length()-1));
            sorted.append(jjval+" ");
            
            System.out.println("jjval: " + jjval);
        }
        return sorted.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new _1859_SortSentence().sortSentence("is2 sentence4 This1 a3"));
    }
}
