/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> a=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        func(root1);
        func(root2);
        Collections.sort(a);
        return a;
    }
    void func(TreeNode root){
        if(root==null)
         return;
         a.add(root.val);
         func(root.left);
         func(root.right);
    }
}