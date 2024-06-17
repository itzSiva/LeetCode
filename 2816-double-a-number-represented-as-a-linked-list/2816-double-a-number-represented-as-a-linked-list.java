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
    public ListNode doubleIt(ListNode l1) {
       
        ListNode temp=null;
        ListNode head=null;
        int carry=0;
        List<Integer> a=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        while(l1!=null){
            st.push(l1.val);
            l1=l1.next;
        }
       
        while(!st.isEmpty()){
            int mul=(st.pop()*2)+ carry;
            int ans1=mul%10;
            carry=mul/10;
            a.add(ans1);
        }
       
        if(carry!=0){
           a.add(carry);
        }
        int n=a.size();
        head=new ListNode(a.get(n-1));
        temp=head;
        for(int i=n-2;i>=0;i--){
            ListNode p=new ListNode(a.get(i));
            temp.next=p;
            temp=temp.next;
        }
        return head;
    }
}
   