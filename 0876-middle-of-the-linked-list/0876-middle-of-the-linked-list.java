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
    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        } else{
            ListNode fast=head;
            ListNode slow=head;
            ListNode num=null;
            while(fast!=null&&fast.next!=null){
                num=slow;
                fast=fast.next.next;
                slow=slow.next;
            }
            return num.next;
        }

    }
}