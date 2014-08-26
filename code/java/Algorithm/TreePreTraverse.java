package Algorithm;

import OrdinaryStructure.TreeConstructor;
import OrdinaryStructure.TreeNode;

public class TreePreTraverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeConstructor TS=new TreeConstructor();
		TreeNode root = TS.makeTree();
		traverse(root);
	}
	public static void traverse(TreeNode root){
		if(root != null){
			System.out.print(root.val + " ");
			traverse(root.leftNode);
			traverse(root.rightNode);
		}
		return;
	}

}
