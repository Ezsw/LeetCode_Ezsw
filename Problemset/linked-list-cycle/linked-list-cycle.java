
// @Title: 环形链表 (Linked List Cycle)
// @Author: 17816069684
// @Date: 2021-03-23 14:52:34
// @Runtime: 0 ms
// @Memory: 39.5 MB

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow,fast;
        if(head == null||head.next == null) return false;
        slow = head; fast = head.next;
        while (fast !=null && fast.next != null){
            if(fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
