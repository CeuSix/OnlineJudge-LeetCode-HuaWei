package Algorithm;
import OrdinaryStructure.ListNode;
import OrdinaryStructure.TreeConstructor;
/*二叉查找树变成双向链表*/
import OrdinaryStructure.TreeNode;

public class TreeToLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建树操作
		TreeConstructor tcConstructor =new TreeConstructor();
		TreeNode root = tcConstructor.makeTree();
		TreeNode head=null;
		TreeNode tail=null;
		//调整链表
		TreeNode result= new TreeNode(0);
		TreeNode preroot= new TreeNode(0);
		transvert(root,result,preroot);	
		//resultNode = resultNode.rightNode;
		while (result.rightNode != null) {
			//System.out.println(resultNode.val);
			System.out.println("结果链表：" + result.rightNode.val);
			result=result.rightNode;
		}
	}
	public static TreeNode transvert(TreeNode root,TreeNode result,TreeNode preRoot){
		if(root == null) return null;
		TreeNode resultNode=new TreeNode(0);
		transvert(root.leftNode,result,preRoot);
		if(null != root){
			System.out.println(root.val);
			System.out.println("PreRoot"+preRoot.val);
			root.leftNode=preRoot;
			preRoot.rightNode=root;
		}		
		preRoot=root;
		if(result.rightNode == null){
			result.rightNode=root;
		}
		//System.out.println("result:"+result.rightNode.leftNode.val);
		transvert(root.rightNode,result,preRoot);
//		if(null != root.rightNode){
//			int temp=root.val;
//			root.val=root.rightNode.val;
//			root.rightNode.val=temp;
//			//修改左子树
//			root.leftNode.rightNode=root.rightNode;
//			//右子树后续节点
//			root.rightNode.rightNode=root;
//			root.rightNode.leftNode=root.leftNode;
//			root.leftNode=root.rightNode;	
//		}
		return root;
	}

}
