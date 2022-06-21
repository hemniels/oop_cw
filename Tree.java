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
		
		if(root == null){
			root = nt;
		}
		while(root != null){
		int cmp = val.compareTo(root.val);
		if (cmp == 0) root.left = nt;
		
		if (cmp < 0){
				root.left = nt;
			}
		if (cmp > 0){
				root.right = nt;
			}
		break;
		}
	}
	
	void printNodes(TreeNode node){
	
		if (node == null){ return; }
		System.out.println(node.val + " ");
		printNodes(node.left);
		printNodes(node.right);
	}
	
	void printNodes(TreeNode node, TreeNode min, TreeNode max){
		
		int cmpMin = node.val.compareTo(min.val);
		int cmpMax = node.val.compareTo(max.val);
		
		if (node == null){ return; }
		
		while (cmpMin >= 0 && cmpMax < 0){
			System.out.println(node.val + " ");
			printNodes(node.left);
			printNodes(node.right);
			break;
		}
	}
	
	public static void main(String[] args){
		
		
		//INTEGER TREE
		Tree<Integer> BST = new Tree<>();
		
		
		BST.insert(12);
		BST.insert(123);
		BST.insert(125);
		BST.insert(5);
		BST.insert(1235123);
		
		
		//STRING TREE
		Tree<String> STree = new Tree<>();
		
		STree.insert("Max");
		STree.insert("Meyer");
		STree.insert("Ewald");
		STree.insert("TEST12");
		
		
		
		
		 
		System.out.println("String Tree printed out: ");
		STree.printNodes(STree.root);
		
		System.out.println("-----------------------");
		
		System.out.println("Integer Tree printed out: ");
		BST.printNodes(BST.root);
		
		System.out.println("-----------------------");
		
		BST.printNodes(BST.root, BST.root.left, BST.root.right);
	}
}
