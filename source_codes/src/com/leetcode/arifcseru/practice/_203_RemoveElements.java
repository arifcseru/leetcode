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
public class _203_RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode temp = head.next;
        ListNode prev = head;
        if (temp == null) {
            if (head.val == val) {
                return null;
            }
            return head;
        }
        while (temp != null) {
            if (head.val == val) {
                if (head.next == null) {
                    return null;
                }
                head = head.next;
                continue;
            }
            if (temp.val == val) {
                if (temp.next == null) {
                    prev.next = null;
                } else {
                    prev.next = temp.next;
                }
                temp = temp.next;
            } else {
                prev = temp;
                temp = temp.next;
            }

        }
        return head;
    }
}
