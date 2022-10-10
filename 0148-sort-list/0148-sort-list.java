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
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode mid=midnode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        
        return merge(left,right);
    
    }
    public ListNode midnode(ListNode head){
        ListNode slow=head,fast=head.next;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        return mid;
    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode dummy=new ListNode(-1);
        ListNode l1=head1,l2=head2,curr=dummy;
        while(l1!=null && l2!=null){
            if(l1.val>=l2.val){
                curr.next=l2;
                l2=l2.next;       
            } else{
                curr.next=l1;
                l1=l1.next;
            }
            curr=curr.next;
        }
        curr.next= l1!=null ? l1 : l2;
        return dummy.next;
    }
}