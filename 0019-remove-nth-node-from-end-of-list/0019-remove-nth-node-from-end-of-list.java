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
        if (head == null || head.next == null)return null;
        ListNode fast = head;
        ListNode slow = head;

for (int i = 1; i < n; i++) { 
    fast = fast.next;
}
//gave n-1 lead to fast and the slow will be n-1 node behind to fast 
//and we will took the slow to just behind the node to be deleted
//then by slow.next=slow.next.next , we will bypass one node that we want to delete

if (fast.next == null)//if after n-1 lead fast at last node  then slow=slow.next will not happen because fast cant move now and slow currently at head so its asking to delete head so return head.next
    return head.next;

while (fast.next.next != null) { //as we are moving fast and slow together after lead and wants 
    slow = slow.next;
    fast = fast.next;
}

slow.next = slow.next.next;
return head;
    }
}