/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class _806_NumberOfLines {

    public int[] numberOfLines(int[] widths, String s) {
        int totalLines = 0, lastLinePixels = 0;
        for (int i = 0; i < s.length(); i++) {
            int counter = 0;
            String temp = "";

            int charIndex = s.charAt(i) - 'a';
            int width = widths[charIndex];
            while ((counter + widths[charIndex]) < 100 && i < s.length()) {
                System.out.println("character-index: " + charIndex + ",counter: " + counter + ", width: " + width);
                temp += s.charAt(i);
                counter += width;
                charIndex = s.charAt(i) - 'a';
                width = widths[charIndex];
                i++;
                System.out.println(temp);
            }
            lastLinePixels = counter;
            i--;
            totalLines++;
            System.out.println(temp);

        }
        int[] array = new int[2];
        array[0] = totalLines;
        array[1] = lastLinePixels;
        return array;
    }

    public static void main(String[] args) {
//       int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
//        String s = "abcdefghijklmnopqrstuvwxyz";
        // int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        // int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        // String s = "bbbcccdddaaa";
        
        
        int[] widths = {5, 7, 4, 7, 6, 7, 9, 5, 8, 8, 5, 10, 9, 10, 2, 5, 7, 9, 3, 8, 8, 8, 10, 2, 2, 9};
        String s = "lgrnv";
        // String s = "abcdefghijklmnopqrstuvwxyz";
        int[] res = new _806_NumberOfLines().numberOfLines(widths, s);
        System.out.println(res[0] + "," + res[1]);
    }
}
