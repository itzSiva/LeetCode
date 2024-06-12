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
        if(head==null||head.next==null)
        return head;
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int m=n-k+1;
       ListNode[] arr=new ListNode[n];
       int a=0;
       while(head!=null){
        arr[a]=head;
        a++;
        head=head.next;
       }
       temp=arr[k-1];
       arr[k-1]=arr[m-1];
       arr[m-1]=temp;

        head=arr[0];
        temp=head;
       for(int i=1;i<n;i++){
            temp.next=arr[i];
            temp=temp.next;
       }
       temp.next=null;
       
       return head;
    }
}