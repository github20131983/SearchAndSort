package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//二叉树的层次遍历,也即广度优先遍历
public class LevelOrderTraversal {
	//非递归算法
	public List<Integer> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<Integer> res=new ArrayList<>();
        if(root==null)return res;
        q.offer(root);        
        while(!q.isEmpty()){           	    		
    		if(q.peek().left!=null)q.offer(q.peek().left);
    		if(q.peek().right!=null)q.offer(q.peek().right);
    		res.add(q.poll().val);       	
        }
        return res;
    }
}
