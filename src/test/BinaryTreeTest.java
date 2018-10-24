package test;

import org.junit.Ignore;
import org.junit.Test;

import binaryTree.ConstructBinaryTreeFromInorderAndPostorderTraversal;
import binaryTree.ConstructBinaryTreeFromPreorderAndInorderTraversal;
import binaryTree.InorderTraversal;
import binaryTree.LevelOrderTraversal;
import binaryTree.PrintTreeByLevelOrderTraversal;
import binaryTree.TreeNode;

public class BinaryTreeTest { 
	@Ignore
	public void testInordreTraversal() {
		TreeNode[] tr1=new TreeNode[3];
		tr1[0]=new TreeNode(1);
		tr1[1]=new TreeNode(2);
		tr1[2]=new TreeNode(3);	
		tr1[0].setLeft(tr1[1]);
		tr1[0].setRight(tr1[2]);
		InorderTraversal it=new InorderTraversal();
		System.out.print(it.inorderTraversal1(tr1[0]));
		System.out.print(it.inorderTraversal1(tr1[0]));
	}
	
	@Ignore
	public void testLevelOrderTraversal(){
		TreeNode[] tr1=new TreeNode[5];
		tr1[0]=new TreeNode(1);
		tr1[1]=new TreeNode(2);
		tr1[2]=new TreeNode(3);	
		tr1[3]=new TreeNode(4);
		tr1[4]=new TreeNode(5);	
		tr1[0].setLeft(tr1[1]);
		tr1[0].setRight(tr1[2]);
		tr1[2].setLeft(tr1[3]);
		tr1[2].setRight(tr1[4]);
		LevelOrderTraversal lot=new LevelOrderTraversal();
		System.out.print(lot.levelOrder(tr1[0]));
	}

	@Ignore
	public void testConstructBinaryTreeFromInorderAndPostorderTraversal(){
		int[] post={9,15,7,20,3};
		int[] in={9,3,15,20,7};
		ConstructBinaryTreeFromInorderAndPostorderTraversal cbtfiapt=
				new ConstructBinaryTreeFromInorderAndPostorderTraversal();
		TreeNode root=cbtfiapt.buildTree(in,post);
		PrintTreeByLevelOrderTraversal p=new PrintTreeByLevelOrderTraversal();
		p.printTree(root);
	}
	
	@Ignore
	public void testConstructBinaryTreeFromInorderAndPretorderTraversal(){
		int[] pre={3,9,20,15,7};
		int[] in={9,3,15,20,7};
		ConstructBinaryTreeFromPreorderAndInorderTraversal cbtfpait=
				new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		TreeNode root=cbtfpait.buildTree(pre, in);
		PrintTreeByLevelOrderTraversal p=new PrintTreeByLevelOrderTraversal();
		p.printTree(root);
	}
}
