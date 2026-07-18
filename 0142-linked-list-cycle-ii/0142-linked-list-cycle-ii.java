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
    public ListNode detectCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
        ListNode temp = head;
//when slow equal fast means cycle/loop then took b at head now slow will start where is it means where slow=fast and b from head and the node where they will meet that definitely will be 1st node of that cycle
            while (temp != slow) {
                temp = temp.next;
                slow = slow.next;
            }  return temp;
        }
    }
 return null;
 }
}
