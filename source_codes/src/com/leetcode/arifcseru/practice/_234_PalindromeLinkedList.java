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
public class _234_PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        String val = "";
        StringBuilder vals1 = new StringBuilder();
        while (head != null) {
            vals1.append(head.val);
            val += head.val;
            head = head.next;
        }
        return val.equals(vals1.reverse().toString());
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1, null))))));
        System.out.println(new _234_PalindromeLinkedList().isPalindrome(head));
    }
}

//Definition for singly-linked list.

