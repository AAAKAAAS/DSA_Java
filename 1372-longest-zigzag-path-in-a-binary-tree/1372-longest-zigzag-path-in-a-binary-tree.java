class Solution {

    int ans = 0;

    public int longestZigZag(TreeNode root) {

        dfs(root, 0, 0);

        return ans;
    }

    private void dfs(TreeNode node, int leftLen, int rightLen) {

        if (node == null) return;

        ans = Math.max(ans, Math.max(leftLen, rightLen));

        dfs(node.left, rightLen + 1, 0);

        dfs(node.right, 0, leftLen + 1);
    }
}