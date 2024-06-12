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
    public ListNode mergeNodes(ListNode head) {
        ListNode newHead=null;
        ListNode temp=null;
        head=head.next;
        int sum=0;
        while(head!=null){
            if(head.val==0 && sum!=0){
                ListNode p=new ListNode(sum);
                sum=0;
                if(newHead==null){
                 newHead=p;
                 temp=p;
                }
                 else{
                    temp.next=p;
                    temp=temp.next;
                 }
                head=head.next;
            }
            else{
                sum+=head.val;
                head=head.next;
            }
        }
        return newHead;
    }
}