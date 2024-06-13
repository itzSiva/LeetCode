/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            if (map.containsKey(temp.val))
                map.put(temp.val, map.get(temp.val) + 1);
            else
                map.put(temp.val, 1);
            temp = temp.next;
        }

        List<Integer> a = new ArrayList<>();
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1)
                a.add(m.getKey());
        }
        Collections.sort(a);
        ListNode sort = null;
        temp = sort;
        for (int i = 0; i < a.size(); i++) {
            ListNode p = new ListNode(a.get(i));
            if (sort == null) {
                sort = p;
                temp = p;
            } else {
                temp.next = p;
                temp = temp.next;
            }
        }
        return sort;
    }
}