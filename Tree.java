class Tree<V extends Comparable<V>> {

	class TreeNode {
		V val;
		TreeNode left, right;

		TreeNode (V v) {
			val = v;
		}
	}

	TreeNode root;

	boolean contains (V val) {
		TreeNode t = root;
		while (t != null) {
			int cmp = val.compareTo(t.val);
			if (cmp == 0) return true;
			if (cmp < 0)
				t = t.left;
			else
				t = t.right;
		}
		return false;
	}

	void insert (V val) {
		TreeNode nt = new TreeNode(val);
	   // TODO implement this method
	}

   // TODO add object method printNodes:
   // - to print all values in the tree in ascending order
   // - to print only values between min and max (inclusive)
}
