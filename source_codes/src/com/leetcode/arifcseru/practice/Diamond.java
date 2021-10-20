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
public class Diamond {
    public static char[] CHARS = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void makeDiamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n-i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j-=1) {
                System.out.print(new Character(CHARS[j])+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int k = i; k >= 0; k-=1) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(new Character(CHARS[j])+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        makeDiamond(26);
    }
}
