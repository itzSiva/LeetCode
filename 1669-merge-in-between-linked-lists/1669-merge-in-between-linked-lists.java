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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        while(temp!=null && b>0){
            temp=temp.next;
            b--;
        }
         ListNode link=temp.next;
         temp=list1;
        while(temp!=null &&a>1){
            temp=temp.next;
            a--;
        }
        temp.next=list2;
         temp=list1;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=link;
        return list1;
    }
}