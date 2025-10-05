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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> ans= new ArrayList<>();
       if(root==null)return ans;
       Queue <TreeNode> q= new LinkedList<>(); 
       boolean flag=true;
       q.add(root);
       while(!q.isEmpty()){
       int s=q.size();
        LinkedList<Integer> level=new LinkedList<>();
       for(int i=0;i<s;i++){
       
        TreeNode node=q.poll();
        if(flag)level.addLast(node.val);
        else {
            level.addFirst(node.val);
        }
        if(node.left!=null)q.add(node.left);
        if(node.right!=null)q.add(node.right);
       }
       ans.add(level);
       flag=!flag;
       }
       return ans;
    }
}