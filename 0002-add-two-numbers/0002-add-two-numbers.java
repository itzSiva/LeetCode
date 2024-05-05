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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=null;
        ListNode head=null;
        int carry=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            int ans=sum%10;
            carry=sum/10;
            ListNode p=new ListNode(ans);
            if(head==null){
                head=p;
                temp=p;
            }
            else{
                temp.next=p;
                temp=temp.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum1=l1.val+ carry;
            int ans1=sum1%10;
            carry=sum1/10;
            ListNode s=new ListNode(ans1);
            if(head==null){
                head=s;
                temp=s;
            }
            else{
                temp.next=s;
                temp=temp.next;
            }
            l1=l1.next;
        }
        while(l2!=null){
            int sum2=l2.val+carry;
            int ans2=sum2%10;
            carry=sum2/10;
            ListNode s=new ListNode(ans2);
            if(head==null){
                head=s;
                temp=s;
            }
            else{
                temp.next=s;
                temp=temp.next;
            }
            l2=l2.next;
        }
        if(carry!=0){
            ListNode c= new ListNode(carry);
            temp.next=c;
        }
        return head;
        
    }
}