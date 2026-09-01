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
    int idx=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] in, int[] post) {
        for(int i=0;i<in.length;i++)map.put(in[i],i);
        idx=post.length-1;
        return build(post,0,post.length-1);
    }
    public TreeNode build(int []post,int left,int right){
        if(left>right)return null;
        int rootval= post[idx--];
        TreeNode root = new TreeNode(rootval);
        int mid=map.get(rootval);
        root.right=build(post,mid+1,right);
        root.left=build(post,left,mid-1);
        return root;
    }
}