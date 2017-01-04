
public class solution{

	public static void main(String[] args) {
		decisionTree tree = new decisionTree();
		tree.BuildTree();
		tree.levelOrder();
		System.out.print(tree.makeJudgement());
	}
}
