package Leetcode.challenge.Algorithms;


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode final_list = temp;
        int remaining = 0;
        int size_l1 = lenght(l1);
        int size_l2 = lenght(l2);
        int limit = Math.max(size_l1, size_l2);
        int i = 0;
        
        while (i < limit) {
            if (i < size_l1 && i < size_l2) {
                temp.next = new ListNode((l1.val + l2.val + remaining) % 10);

                if (l1.val + l2.val + remaining >= 10)
                    remaining = 1;
                else
                    remaining = 0;

                l1 = l1.next;
                l2 = l2.next;

            } else if (i >= size_l1) {
                temp.next = new ListNode((l2.val + remaining) % 10);

                if (l2.val + remaining >= 10)
                    remaining = 1;
                else
                    remaining = 0;

                l2 = l2.next;

            } else {
                temp.next = new ListNode((l1.val + remaining) % 10);

                if (l1.val + remaining >= 10)
                    remaining = 1;
                else
                    remaining = 0;

                l1 = l1.next;

            }

            temp = temp.next;
            i++;
        }
        if (remaining == 1) {
            temp.next = new ListNode(1);
        }

        final_list = final_list.next;
        return final_list;
    }

    int lenght(ListNode l1) {
        int i = 0;
        while (l1 != null) {
            l1 = l1.next;
            i++;
        }
        return i;
    }
}
