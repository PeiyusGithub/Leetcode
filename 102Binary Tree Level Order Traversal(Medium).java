/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        List<List<Integer>> List = new LinkedList<List<Integer>>();
        if (root == null) return List;
        
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.remove();
                sublist.add(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            List.add(sublist);
        }
        
        return List;
    }
}