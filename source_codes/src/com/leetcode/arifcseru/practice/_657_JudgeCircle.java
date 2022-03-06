/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author User
 */
public class _657_JudgeCircle {

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                x++;
            } else if (moves.charAt(i) == 'R') {
                x--;
            } else if (moves.charAt(i) == 'U') {
                y++;
            } else if (moves.charAt(i) == 'D') {
                y--;
            }
        }
        return x == 0 && y == 0;
    }
}
