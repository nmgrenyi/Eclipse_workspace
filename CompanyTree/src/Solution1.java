import java.util.*;

class Node {
	int val;
	ArrayList<Node> children;
	public Node (int val) {
		this.val = val;
		children = new ArrayList<Node>();
	}
}

class SumCount {
	int sum;
	int count;
	public SumCount (int sum, int count) {
		this.sum = sum;
		this.count = count;
	}
}

public class Solution1 {
	
	private static Node getHighAve(Node root) {
		double[] resAve = new double[1]; 
		resAve[0] = Double.MIN_VALUE;
		Node[] result = new Node[1];
		if (root == null) {
			return null;
		}
		dfs(root, resAve, result);
		System.out.println(resAve[0]);
		return result[0];
	}
	
	private static SumCount dfs (Node root, double[] resAve, Node[] result) {
		if (root.children == null || root.children.size() == 0) {
			return new SumCount(root.val, 1);
		}
		int curSum = root.val;
		int curCnt = 1;
		
		for (Node child : root.children) {
			SumCount cSC = dfs(child, resAve, result);
			curSum += cSC.sum;
			curCnt += cSC.count;
		}
		double curAve = (double) curSum/curCnt;
		if (resAve[0] < curAve) {
			resAve[0] = curAve;
			result[0] = root;
		}
		
		return new SumCount(curSum, curCnt);
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
