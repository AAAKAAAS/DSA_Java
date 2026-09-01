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
    int preidx=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] pre, int[] in) {
      for(int i=0;i<in.length;i++)map.put(in[i],i);
      return build(pre,0,in.length-1);  
    }
    public TreeNode build(int pre[],int left,int right){
        if(left>right)return null;
        int rootv=pre[preidx++];
        TreeNode root = new TreeNode(rootv);
        int mid=map.get(rootv);
        root.left=build(pre,left,mid-1);
        root.right=build(pre,mid+1,right);
        return root;
    }
}