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
    public int pairSum(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            s.push(temp.val);
            temp=temp.next;
            n++;
        }
        ListNode head2=null;
        temp=null;
        while(!s.isEmpty()){
            ListNode p=new ListNode(s.pop());
            
            if(head2==null){
                head2=p;
                temp=p;
            }
            else{
                temp.next=p;
                temp=temp.next;
            }
        }
        int sum=0;
        int k=n/2;
        while(k>0){
            if(head.val+head2.val > sum){
            sum=head.val+head2.val;
            }
            head=head.next;
            head2=head2.next;
            k--;
        }
        return sum;
    }
}