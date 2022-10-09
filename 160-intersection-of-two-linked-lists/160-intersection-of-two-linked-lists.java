/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode NumA = headA;
        ListNode NumB = headB;
        int count1=0;
        int count2=0;
        
        while(NumA!=null){
            count1++;
            NumA=NumA.next;
        }
        
        while(NumB!=null){
            count2++;
            NumB=NumB.next;
        }
        NumB=headB;
        NumA=headA;
        if(count1>count2){
            int dif=count1-count2;
            while(NumA!=null&& dif>0){
                NumA=NumA.next;
                dif--;
            }
        } else{
            int dif=count2-count1;
            while(NumB!=null&& dif>0){
                NumB=NumB.next;
                dif--;
            }
        }
        
        while(NumA!=null && NumB!=null && NumA!=NumB){
            NumA=NumA.next;
            NumB=NumB.next;
        }
        if(NumA==NumB){
            return NumA;
        } 
        return null;
        
    }
}