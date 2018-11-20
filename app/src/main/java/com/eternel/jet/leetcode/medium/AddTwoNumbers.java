package com.eternel.jet.leetcode.medium;

public class AddTwoNumbers {
    /**
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     * <p>
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * <p>
     * Example:
     * <p>
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next=new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        listNode2.next=new ListNode(9);
        ListNode listNode = addTwoNUmbers(listNode1, listNode2);
        System.out.print(listNode.val);
        while (listNode.next != null) {
            System.out.print(listNode.next.val);
            listNode = listNode.next;
        }
    }

    /**
     * 反转相加再反转组成链。(直接相加，向下一位进位，然后反转)
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNUmbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode listNode =node;
        int sum = 0;
        while (l1 != null || l2 != null) {
            sum /= 10;
            //l1.val+l2.val的值，相加大于10需要进位，sum除10得到进位后的值
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum +=  l2.val;
                l2 = l2.next;
            }
            listNode.next=new ListNode(sum%10);
            listNode=listNode.next;
        }
        //最高位时是否需要进位
        if(sum/10!=0) {
            listNode.next=new ListNode(1);
        }
        return node.next;

    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
