

public class Solution {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null){return null;}
        if (p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(TreeNode root.right, TreeNode p, TreeNode q);
        }else if(p.val < root.val && q.val < root.val){
            return lowestCommenAncestor(TreeNode root.left, TreeNode p, TreeNode q);
        }else{
            return root;
        }
        return null;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
