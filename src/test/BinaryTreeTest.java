package test;

import org.junit.Ignore;
import org.junit.Test;

import binaryTree.InorderTraversal;
import binaryTree.LevelOrderTraversal;
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
	
	@Test
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
}
