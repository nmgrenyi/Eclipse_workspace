import java.util.*;

public class Solution2 {
	
	public static Node getHighAve (Node root) {
		Node[] res = new Node[1];
		if (root == null) {
			return null;
		}
		double[] resAve = new double[1];
		dfs(root, res, resAve);
		System.out.println(resAve[0]);
		return res[0];
	}
	
	public static SumCount dfs (Node root, Node[] res, double[] resAve) {
		if (root == null || root.children.size() == 0) {
			return new SumCount(root.val, 1);
		}
		int curSum = root.val;
		int curCount = 1;
		for (Node child : root.children) {
			SumCount cSC = dfs(child, res, resAve);
			curSum += cSC.sum;  
			curCount += cSC.count; 
		}
		double curAve = (double)curSum/curCount;
		if (curAve > resAve[0]) {
			resAve[0] = curAve;
			res[0] = root;
		}
		return new SumCount(curSum, curCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		Node _121 = new Node(2);
		Node _122 = new Node(3);
		Node _123 = new Node(4);
		Node _131 = new Node(5);
		Node _132 = new Node(5);
		Node _133 = new Node(5);
		Node _134 = new Node(5);
		Node _135 = new Node(5);
		Node _136 = new Node(5);
		
		_121.children.add(_131);
		_121.children.add(_132);
		
		_122.children.add(_133);
		_122.children.add(_134);
		
		_123.children.add(_135);
		_123.children.add(_136);
		
		root.children.add(_121);
		root.children.add(_122);
		root.children.add(_123);
		
		Node res = getHighAve(root);
		System.out.println(res.val);

	}

}