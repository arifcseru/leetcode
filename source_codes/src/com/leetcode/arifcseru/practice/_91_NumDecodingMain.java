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
public class _91_NumDecodingMain {

    private int[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int dp[] = new int[s.length() + 1];
        int n = s.length();

        dp[n] = 1;

        if (s.charAt(n - 1) != '0') {
            dp[n - 1] = 1;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                dp[i] = dp[i + 1];
            }
            if (s.charAt(i) == '1') {
                dp[i] += dp[i + 2];
            }
            if (s.charAt(i) == '2' && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '6') {
                dp[i] += dp[i + 2];
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        // input: 11106 , output: 3
        // input: 12 , output: 2
        // input: 226 , output: 3
        // input: 0 , output: 0
        int res = new _91_NumDecodingMain().numDecodings("11106");
        System.out.println(res);
    }
}
