/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

import java.util.Stack;

/**
 *
 * @author Arifur Rahman
 */
public class _20_ValidParenthesis {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new _20_ValidParenthesis().isValid("()"));
        System.out.println(new _20_ValidParenthesis().isValid("()[]{}"));
        System.out.println(new _20_ValidParenthesis().isValid("(]"));
        System.out.println(new _20_ValidParenthesis().isValid("([)]")); // fact 2
        System.out.println(new _20_ValidParenthesis().isValid("{[]}"));  // fact 1
        System.out.println(new _20_ValidParenthesis().isValid("{[()]}"));  // fact 1
        System.out.println(new _20_ValidParenthesis().isValid("([}}])"));  // fact 1
        // ([

    }
}
