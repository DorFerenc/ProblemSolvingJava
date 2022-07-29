package level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null)
			return res;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty())
		{
			int size = q.size();

			List<Integer> resX = new ArrayList<Integer>();
			for(int i = 0; i < size; i++)
			{
				TreeNode currRoot = q.poll();
				resX.add(currRoot.val);
				if(currRoot.left != null)
					q.add(currRoot.left);
				if(currRoot.right != null)
					q.add(currRoot.right);
			}
			res.add(resX);
		}
		return res;
	}

}
