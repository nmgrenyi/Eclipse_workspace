package leetcode124;

public class Solution {

	public int maxPathSum(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int left = maxPathSum(root.left);
        int right = maxPathSum(root.right);
        return Math.max(Math.max(left, right), 0) + root.val;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		root.left = node1;
		root.right = node2;
		Solution lc = new Solution();
		int res = lc.maxPathSum(root);
		System.out.println(res);
	}

}
