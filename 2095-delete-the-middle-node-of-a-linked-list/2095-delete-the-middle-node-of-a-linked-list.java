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
    public ListNode deleteMiddle(ListNode head) {
        
        ListNode num=head;
        ListNode slow=head;
        if( num.next == null ){
            return null;
        } else{
            int count=0;
            while(num!=null){
                count++;
                num=num.next;
            }
            int temp=count/2-1;
            while(temp>0 && slow!=null){
                temp--;
                slow=slow.next;
            }
            slow.next=slow.next.next;
            return head;
        }
        
        
    }
}