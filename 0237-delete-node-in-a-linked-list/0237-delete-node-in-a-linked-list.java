/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode target) { //we dont have access of head node so we cant travel till just previous node of target and detach target
        target.val=target.next.val; //so we firstly stored value of next node in target
        target.next=target.next.next; //then detached next node
    }
}