package leetcode95;

import java.util.ArrayList;
import java.util.List;

public class leetcode95 {
	
	public List<TreeNode> generateTrees(int n){
        return genTrees(1, n);
    }
 
    public List<TreeNode> genTrees (int start, int end){
        List<TreeNode> list = new ArrayList<TreeNode>();
        if(start > end){
            list.add(null);
            return list;
        }
        if(start == end){
            list.add(new TreeNode(start));
            return list;
        }
        List<TreeNode> left,right;
        for(int i=start;i<=end;i++){
            left = genTrees(start, i-1);
            right = genTrees(i+1,end);
            for(TreeNode lnode: left){
                for(TreeNode rnode: right){
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
            }
        }
        return list;
    }
    
    public static void printNode(TreeNode node){
    	if (node != null){
    		System.out.println(node.val);
    		if (node.left != null){
    			System.out.print("left:");
    			printNode(node.left);
    		}
    		if (node.right != null){
    			System.out.print("right:");
    			printNode(node.right);
    		}
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetcode95 lc95 = new leetcode95();
		for (TreeNode i : lc95.generateTrees(3)){
			printNode(i);
//			System.out.print(i.val);
//			System.out.print(i.left.val);
//			System.out.print(i.right.val);
//			System.out.print(i.left.left.val);
//			System.out.print(i.left.right.val);
//			System.out.print(i.right.left.val);
//			System.out.print(i.right.right.val);
			System.out.println("");
		}
	}

}
