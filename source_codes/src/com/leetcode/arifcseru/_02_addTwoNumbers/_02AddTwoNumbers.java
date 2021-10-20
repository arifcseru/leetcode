/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru._02_addTwoNumbers;

/**
 *
 * @author Arifur Rahman
 */
public class _02AddTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode ln1 = new ListNode(9);
        ListNode ln2 = new ListNode(7);
        System.out.println(solution.addTwoNumbers(ln1, ln2).val);
        System.out.println(solution.addTwoNumbers(ln1, ln2).next.val);
        System.out.println(solution.addTwoNumbers(ln1, ln2).val);
    }
}

// Definition for singly-linked list.
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Val = (l1 != null) ? l1.val : 0;
            int l2Val = (l2 != null) ? l2.val : 0;
            int currentNum = l1Val + l2Val + carry;
            carry = currentNum / 10;
            int lastDigit = currentNum % 10;
            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            l3.next = newNode;
            l3 = l3.next;
        }
        return dummyHead.next;
    }
}
