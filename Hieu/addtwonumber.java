/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        while ((l1 != null) || (l2 != null)){
            if (l1 != null) {
                result.val = result.val + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                result.val = result.val + l2.val;
                l2 = l2.next;
            }
            ListNode newNode = new ListNode(result.val/10);
            result.val = result.val % 10;
            result.next = newNode;
            result = result.next;
        }
        result.next = null;
        return result;
    }
}