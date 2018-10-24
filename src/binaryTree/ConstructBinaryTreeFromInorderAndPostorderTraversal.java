package binaryTree;

//根据中序遍历与后序遍历结果构造二叉树
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(postorder.length-1, 0, inorder.length-1, inorder, postorder);
    }
	public TreeNode buildTreeHelper(int postEnd,int inStart,int inEnd,int[] inorder, int[] postorder) {
        if(postEnd<0||inStart>inEnd)
        	return null;
        TreeNode root=new TreeNode(postorder[postEnd]);
        int inIndex=0;
        for (int i = 0; i < inorder.length; i++)
			if(root.val==inorder[i])
				inIndex=i;
		root.left=buildTreeHelper(postEnd-(inEnd-inIndex)-1, inStart, inIndex-1, inorder, postorder);
		root.right=buildTreeHelper(postEnd-1, inIndex+1, inEnd, inorder, postorder);
		return root;
    }
}
