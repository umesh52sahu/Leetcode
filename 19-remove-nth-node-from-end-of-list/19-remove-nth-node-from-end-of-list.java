/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast, slow;
        fast = slow = head;
        ListNode prev = null;
        int temp = n;
        while(temp != 0 && fast != null)
        {
            fast = fast.next;
            temp--;
        }
        
        while(fast != null)
        {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if(prev == null)
        {
            return slow.next;
        }else{
            prev.next = slow.next;
        }
        
        return head;
    }
}