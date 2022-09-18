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
       if(head==null){
           return false;
       } else{
                ListNode fast=new ListNode();
                ListNode slow = new ListNode();
                slow = head;
           
           
                fast = head;
                while(fast.next!=null && fast.next.next!=null ){
                    if(fast.next==slow || fast.next.next==slow){
                        return true;
                    }
                    slow=slow.next;
                    fast=fast.next.next;
                }
                return false;
            }
       }
}