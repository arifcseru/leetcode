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
public class _190_ReverseBits {

    public int reverseBits(int n) {
        int[] bits = new int[32];

        int count = 0;

        //Construct the Binary representation of the input using the bitwise AND and right shift operations.
        while (count < 32) {
            int num = n & 1;

            //We are setting the bits in reverse order.
            if (num > 0) {
                bits[count] = 1;
            } else {
                bits[count] = 0;
            }
            count++;
            n = n >>> 1;
            // System.out.println("num: " + num + ", n: " + n);
        }

        //Construct the String representation 
        StringBuffer finalStr = new StringBuffer("");
        for (int i : bits) {
            finalStr.append(i);
        }
        // System.out.println("final bits: " + finalStr);

        //Parse using the standard java library.
        return Integer.parseUnsignedInt(finalStr.toString(), 2);
    }

    public static void main(String[] args) {
        System.out.println(new _190_ReverseBits().reverseBits(5));
        System.out.println(new _190_ReverseBits().reverseBits(2));
        System.out.println(new _190_ReverseBits().reverseBits(4));
    }
}
