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
		int cmp = val.compareTo(nt.val);
		
		if(cmp == 0){
			nt = root;
		}else if(cmp < 0){
			nt = nt.left;
		}else{
			nt = nt.right;
		}
	}


	public static void main(String[] args){
		
		Tree<Integer> BST = new Tree<>();
		
		BST.insert(12);
		BST.insert(123);
		BST.insert(125);
		BST.insert(5);
		BST.insert(1235123);
	}
	
	
   /* 
	TODO add object method printNodes:
    - to print all values in the tree in ascending order
    - to print only values between min and max (inclusive)
	*/
}
