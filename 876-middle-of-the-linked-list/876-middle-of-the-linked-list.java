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
        ListNode num=new ListNode();
        num=head;
        ListNode Hnode=new ListNode();
        Hnode=head;
        if(num.next==null){
            return num;
        } else{
            int count=0;
            while(num.next!=null){
                count++; 
                num=num.next;
            }
            count++;
            int flag=0;
            count=count/2+1;
            while(Hnode!=null){
                flag++;
                if(flag==count){
                    head=Hnode;
                    break;
                }
                Hnode=Hnode.next;
            }
        }
        return head;
        
    }
}