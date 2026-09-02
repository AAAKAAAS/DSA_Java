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
class BSTIterator {
 List<Integer> abc = new ArrayList<>();
    public BSTIterator(TreeNode root) {
        in(root);
    }
    public void in(TreeNode root){
        if(root==null)return;
        in(root.right);
        abc.add(root.val);
        in(root.left);
    }
    public int next() {
        int a=abc.get(abc.size()-1);
        abc.remove(abc.size()-1);
        return a;
    }
    
    public boolean hasNext() {
        return !abc.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */