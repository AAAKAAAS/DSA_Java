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
    int sum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       check(root); 
       return sum;
    }
    public int check(TreeNode node){
        if(node==null)return 0;
        int left=Math.max(0,check(node.left));
        int right=Math.max(0,check(node.right));
        sum=Math.max(sum,left+right+node.val);
        return node.val+Math.max(left,right);
    }
}