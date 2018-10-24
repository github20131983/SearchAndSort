package binaryTree;

import java.util.List;

public class PrintTreeByLevelOrderTraversal {
	public void printTree(TreeNode root){
		LevelOrderTraversal llt=new LevelOrderTraversal();
		List<Integer> res=llt.levelOrder(root);
		System.out.print(res);
	}
}
