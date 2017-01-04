
public class leetcode110_1 {
	
	public boolean isBalanced(TreeNode root) {
        if (root != null){
            if (Math.abs(depth(root.left, 1) - depth(root.right, 1)) > 1){
                return false;
            }
            else{
                return true;
            }
        }
        else {
            return true;
        }
    }
    
    public int depth(TreeNode node, int level){
        if (node != null){
            if (node.left == null & node.right == null){
                return level;
            }
            else if (node.left == null & node.right != null){
                return depth(node.right, level+1);
            }
            else if (node.left != null & node.right == null){
                return depth(node.left, level+1);
            }
            else{
                return Math.max(depth(node.left, level+1), depth(node.right, level+1));
            }
        }
        else {
            return level-1;
        }
    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetcode110_1 LC110 = new leetcode110_1();
		
		TreeNode [] tn = new TreeNode [7];
		TreeNode t1 = new TreeNode(1);
		TreeNode t2_1 = new TreeNode(2);
		TreeNode t2_2 = new TreeNode(2);
		TreeNode t3_1 = new TreeNode(2);
		TreeNode t3_2 = new TreeNode(2);
		TreeNode t4_1 = new TreeNode(2);
		TreeNode t4_2 = new TreeNode(2);
		tn[0] = t1;
		tn[1] = t2_1;
		tn[2] = t2_2;
		tn[3] = t3_1;
		tn[4] = t3_2;
		tn[5] = t4_1;
		tn[6] = t4_2;
		t1.left = t2_1; 
		t1.right = t2_2; 
		t2_1.left = t3_1; 
		t2_2.right = t3_2; 
		t3_1.left = t4_1; 
		t3_2.right = t4_2; 
		System.out.println(LC110.isBalanced(t1));

	}

}
