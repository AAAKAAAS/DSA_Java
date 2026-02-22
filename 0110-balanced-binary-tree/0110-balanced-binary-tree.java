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
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int left=dist(root.left);
        int right=dist(root.right);
        if(Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right))return true;
        return false;
    }
    public int dist(TreeNode a){
        if(a==null)return 0;
        return 1+Math.max(dist(a.left),dist(a.right));
    }
}