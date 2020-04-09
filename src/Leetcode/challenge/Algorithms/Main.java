package Leetcode.challenge.Algorithms;

public class Main {

    public static void main(String[] args) {
        // 1->9->9->9->9->9->9->9->9->9
        ListNode objcet11 = new ListNode(1);
        ListNode objcet12 = new ListNode(9);
        ListNode objcet13 = new ListNode(9);
        ListNode objcet14 = new ListNode(9);
        ListNode objcet15 = new ListNode(9);
        ListNode objcet16 = new ListNode(9);
        ListNode objcet17 = new ListNode(9);
        ListNode objcet18 = new ListNode(9);
        ListNode objcet19 = new ListNode(9);
        ListNode objcet20 = new ListNode(9);

        objcet11.next = objcet12;
        objcet12.next = objcet13;
        objcet13.next = objcet14;
        objcet14.next = objcet15;
        objcet15.next = objcet16;
        objcet16.next = objcet17;
        objcet17.next = objcet18;
        objcet18.next = objcet19;
        objcet19.next = objcet20;

        // 5->6->4
        ListNode objcet21 = new ListNode(5);
        ListNode objcet22 = new ListNode(6);
        ListNode objcet23 = new ListNode(4);
        objcet21.next = objcet22;
        objcet22.next = objcet23;
        objcet23.next = null;


        Solution s1 = new Solution();
        s1.addTwoNumbers(objcet11, objcet21);
        // 6->5->4->0->0->0->0->0->0->0->1
    }
}
