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
    public boolean isPalindrome(ListNode head) {
        ListNode num=head;
        ListNode temp=head;
        while(num!= null && num.next != null){
            num=num.next.next;
            temp=temp.next;
        }
     //   reverse(temp);
        
         ListNode curr=temp;
        ListNode prev=null;
        ListNode forward=null;
        while(curr!= null){
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;}
    
        boolean istrue=true;
        curr=head;
        while(prev!=null){
            if(curr.val != prev.val){
                istrue=false;
                //display(head);
                return istrue;
            }
             prev=prev.next;
            curr=curr.next;
        }
        return istrue;
    }
    // public static void reverse(ListNode head){
    //     ListNode curr=head;
    //     ListNode prev=null;
    //     ListNode forward=null;
    //     while(curr!= null){
    //         forward=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=forward;
    //     }
    //     display(prev);
    //     head=prev;
    // }
    public static void display(ListNode head){
        ListNode num=head;
        while(num!=null){
            System.out.print(" " + num.val);
            num=num.next;
        }
    }
}