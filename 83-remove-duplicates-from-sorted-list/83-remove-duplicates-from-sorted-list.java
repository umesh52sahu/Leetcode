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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode num=new ListNode();
        ListNode temp=new ListNode();
        num=head;
        if(head==null){
            return head;
        } else{
              while(num.next!=null){
                temp=num.next;
                if(num.val==temp.val){
                    num.next=temp.next;
                } else{
                    num=temp;
                }  
            }      
        }
      
        return head;
    }
}