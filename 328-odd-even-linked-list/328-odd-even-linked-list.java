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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode odd=head;
        ListNode Even=head.next;
        ListNode Evenhead=head.next;
        while(Even!=null&&Even.next!=null){
            odd.next=odd.next.next;
            Even.next=Even.next.next;
            odd=odd.next;
            Even=Even.next;
        }
        odd.next=Evenhead;
        return head;
    }
}