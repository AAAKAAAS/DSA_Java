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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a= new ArrayList<>();
        Stack<TreeNode> b= new Stack<>();
        Stack<TreeNode> c= new Stack<>();
        if(root==null)return a;
        b.push(root);
        while(!b.isEmpty()){
          TreeNode curr=b.pop();
          c.push(curr);
          if(curr.left!=null)b.push(curr.left);
          if(curr.right!=null)b.push(curr.right);
        }
        while(!c.isEmpty()){
            a.add(c.pop().val);
        }
        return a;
    }
}