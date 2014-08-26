package Algorithm;

import OrdinaryStructure.TreeConstructor;
import OrdinaryStructure.TreeNode;

public class TreeMiddleTraverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeConstructor TS=new TreeConstructor();
		TreeNode root = TS.makeTree();
		traverse(root);
	}
	public static void traverse(TreeNode root){
		if(root == null) return;
		traverse(root.leftNode);
		System.out.println(root.val);
		traverse(root.rightNode);
		return;
	}
}
