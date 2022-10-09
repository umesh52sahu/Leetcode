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
        int count=0;
        ListNode num=head;
        ListNode temp=head;
        while(num!=null){
            count++;
            num=num.next;
        }
        if(count==n){
            head=temp.next;
            return head;
        } else{
            ListNode fast=head;
            ListNode slow=head;
            fast=fast.next.next;
            
            for(int i=0;i<count-n-1;i++){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=fast;
            return head;
        }
    }
}