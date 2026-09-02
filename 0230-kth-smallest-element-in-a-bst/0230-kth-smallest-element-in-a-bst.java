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
    List<Integer> abc = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
       in(root);
       return abc.get(k-1); 
    }
    public void in(TreeNode root){
        if(root==null)return;
        in(root.left);
        abc.add(root.val);
        in(root.right);
    }
}