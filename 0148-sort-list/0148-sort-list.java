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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
        return head;
            ListNode temp=head;
            int n=0;
            List<Integer> a=new ArrayList<>();
            while(temp!=null){
                a.add(temp.val);
                temp=temp.next;
            }
            Collections.sort(a);
            ListNode sort=null;
            temp=sort;
            for(int i=0;i<a.size();i++){
                ListNode p=new ListNode(a.get(i));
                if(sort==null){
                    sort=p;
                    temp=p;
                }
                else
                {
                    temp.next=p;
                    temp=temp.next;
                }
            }
        return sort;
    }
}