package level1;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePreorderTraversal {
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
		if (root == null)
			return new ArrayList<Integer>();
		res.add(root.val);
		for (Node n : root.children)
			preorder(n);
		return res;
    }
}
