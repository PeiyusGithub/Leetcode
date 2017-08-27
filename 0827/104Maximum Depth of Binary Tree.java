class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode root, int count) {
        if (root == null) return count;
        count++;
        int left = dfs(root.left, count);
        int right = dfs(root.right, count);
        return Math.max(right,left);
    }
}