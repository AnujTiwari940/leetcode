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
    public ListNode swapNodes(ListNode head, int k) {
        //getting kth node value from starting
        ListNode temp1=head;
        for(int i=1;i<k;i++){
            temp1=temp1.next;
        }        
        //getting kth node value from ending
        ListNode fast=head;
        ListNode slow=head;
        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
            }
        int temp=temp1.val;
        temp1.val=slow.val;
        slow.val=temp;
        return head;}}