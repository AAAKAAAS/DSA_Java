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
    public int sumNumbers(TreeNode root) {
       List<List<Integer>> abc = allPaths(root);
       int sum=0;
       for(List<Integer> xyz :abc){
        int num=0;
          for(int i=0;i<xyz.size();i++){
           num=num*10+xyz.get(i);
          }
          sum+=num;
       }
       return sum;
    }

    public List<List<Integer>> allPaths(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        dfs(root, new ArrayList<>(), ans);

        return ans;
    }

    private void dfs(TreeNode root,
                     List<Integer> path,
                     List<List<Integer>> ans) {

        if (root == null)
            return;

        path.add(root.val);

        if (root.left == null && root.right == null) {
            ans.add(new ArrayList<>(path));
        } else {
            dfs(root.left, path, ans);
            dfs(root.right, path, ans);
        }

        path.remove(path.size() - 1); // backtrack
    }
}
