package OrdinaryStructure;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TreeNode {

	/**
	 * @param args
	 */
	public int val;
	public TreeNode leftNode;
	public TreeNode rightNode;
	public TreeNode(int x) {
		val = x;
		leftNode = null;
		rightNode=null;
	}
	//树节点的构造
	public void SetNode(TreeNode left,TreeNode right) {
		leftNode = left;
		rightNode=right;
	}

}
