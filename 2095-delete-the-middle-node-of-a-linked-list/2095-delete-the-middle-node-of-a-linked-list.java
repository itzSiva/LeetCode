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
        if(head==null|| head.next==null)
        return null;
        int n=0;
        ListNode temp=head;
        while(temp.next!=null){
            n++;
            temp=temp.next;
        }
        temp=head;
        int m=0;
        if(n%2==0)
        m=n/2-1;
        else
        m=n/2;

        int k=0;
        while(temp!=null){
            if(k==m){
                temp.next=temp.next.next;
                break;
            }
            k++;
            temp=temp.next;
        }
        
        return head;
    }
}