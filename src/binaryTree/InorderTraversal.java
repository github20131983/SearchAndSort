package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//二叉树的中序遍历
public class InorderTraversal {
	//使用递归方法遍历
	public List<Integer> inorderTraversal1(TreeNode root) {
		List<Integer> res=new ArrayList<Integer>();
		inorderTraversalHelp(root,res);
		return res;
	}
	public void inorderTraversalHelp(TreeNode root,List<Integer> res) {
		if(root!=null){
			inorderTraversalHelp(root.left,res);
			res.add(root.val);
			inorderTraversalHelp(root.right, res);
		}
	}
	//使用非递归方法遍历
	public List<Integer> inorderTraversal2(TreeNode root) {
		Stack<TreeNode> s=new Stack<TreeNode>();
		List<Integer> l=new ArrayList<Integer>();
		TreeNode cur=root;
		while(!s.isEmpty()||root!=null){
			while(cur!=null){
				s.push(cur);
				cur=cur.left;
			}
			cur=s.pop();
			l.add(cur.val);
			cur=cur.right;
		}
		return l;
	}
}
