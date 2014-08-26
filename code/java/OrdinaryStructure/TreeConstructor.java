package OrdinaryStructure;

public class TreeConstructor {
	public TreeNode  makeTree()
	{
		TreeNode tn=new TreeNode(5);
		TreeNode tn1=new TreeNode(3);
		TreeNode tn2=new TreeNode(1);
		TreeNode tn3=new TreeNode(4);
		TreeNode tn4=new TreeNode(6);
		TreeNode tn5=new TreeNode(8);
		TreeNode tn6=new TreeNode(7);
		tn.leftNode=tn1;
		tn.rightNode=tn6;
		tn1.leftNode=tn2;
		tn1.rightNode=tn3;
		tn6.leftNode=tn4;
		tn6.rightNode =tn5;
		return tn;
	}
}
