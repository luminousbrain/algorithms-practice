package LeetCode.easy;

import java.util.List;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        // Input: l1 = [1,2,4], l2 = [1,3,4]
        // Output: [1,1,2,3,4,4]
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode root = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode current = null;
        if (l1.val > l2.val) {
            current = l2;
            l2 = l2.next;
        } else {
            current = l1;
            l1 = l1.next;
        }
        ListNode root = current;

        while (true) {
            if (l1 == null) {
                while (l2 != null) {
                    current.next = l2;
                    current = current.next;
                    l2 = l2.next;
                }
                break;
            }
            if (l2 == null) {
                while (l1 != null) {
                    current.next = l1;
                    current = current.next;
                    l1 = l1.next;
                }
                break;
            }

            if (l1.val > l2.val) {
                current.next = l2;
                l2 = l2.next;
            } else {
                current.next = l1;
                l1 = l1.next;
            }
            current = current.next;
        }
        return root;
    }

    static class ListNode {
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
}