package binaryTree;

//根据前序遍历与中序遍历结果构造二叉树
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(0,0,inorder.length-1, preorder, inorder);
    }
	public TreeNode buildTreeHelper(int preStart,int inStart,int inEnd,int[] preorder, int[] inorder){
		if(preStart>preorder.length-1||inStart>inEnd)
			return null;
		TreeNode root=new TreeNode(preorder[preStart]);
		int inIndex=0;
		for(int i=0;i<inorder.length;i++){
			if(root.val==inorder[i])
				inIndex=i;
		}
		root.left=buildTreeHelper(preStart+1, inStart, inIndex-1, preorder, inorder);
		root.right=buildTreeHelper(preStart+inIndex-inStart+1, inIndex+1, inEnd, preorder, inorder);
		return root;
	}
}
