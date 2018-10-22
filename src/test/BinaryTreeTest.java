package test;

import static org.junit.Assert.*;

import org.junit.Test;

import binaryTree.InorderTraversal;
import binaryTree.TreeNode;

public class BinaryTreeTest { 
	@Test
	public void test() {
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

}
