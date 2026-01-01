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
        ListNode temp = head;
        int size = 0;
        // get the size of the list
        while(temp != null){
            temp = temp.next;
            size++;
        }
        // get the middle index
        size = size / 2;
        // traverse to the middle node
        temp = head;
        int c = 1;
        // traverse to the node before the middle node
        while (c != size){
            temp = temp.next;
            c++;
        }
        // delete the middle node
        temp.next = temp.next.next;
        return head; 
    }
}