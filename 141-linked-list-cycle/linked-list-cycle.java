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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs=new HashSet<>();
        while(head!=null){
            if(hs.contains(head)){
                return true;
            }
            hs.add(head);
            head=head.next;
        }
        return false;
    }
}