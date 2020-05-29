class Node
{
	int data;
	Node left = null, right = null;

	Node(int data) {
		this.data = data;
	}
}

class LCABST
{
	// Recursive function to insert a key into BST
	public static Node insert(Node root, int key)
	{
		// if the root is null, create a new node and return it
		if (root == null) {
			return new Node(key);
		}

		// if given key is less than the root node, recur for left subtree
		if (key < root.data) {
			root.left = insert(root.left, key);
		}

		// if given key is more than the root node, recur for right subtree
		else {
			root.right = insert(root.right, key);
		}

		return root;
	}

	// Iterative function to search a given key in root
	public static boolean search(Node root, int key)
	{
		// traverse the tree and search for the key
		while (root != null)
		{
			// if given key is less than the current node, go to left
			// subtree else go to right subtree

			if (key < root.data) {
				root = root.left;
			}
			else if (key > root.data) {
				root = root.right;
			}
			// if key is found return true
			else {
				return true;
			}
		}

		
		return false;
	}

	
	public static Node LCA(Node root, int x, int y)
	{
		if (root == null || !search(root, x) || !search(root, y)) {
			return null;
		}

		
		Node curr = root;

		
		while (curr != null)
		{
			if (curr.data > Integer.max(x, y)) {
				curr = curr.left;
			}
			else if (curr.data < Integer.min(x, y)) {
				curr = curr.right;
			}
			else {
				return curr;
			}
		}
		return curr;
	}

	public static void main(String[] args)
	{
		Node root = null;
	
		int[] keys = {15, 10, 20, 8, 12, 16, 25};

		for (int key : keys) {
			root = insert(root, key);
		}

		Node lca = LCA(root, 8, 12);
		if (lca != null) {
			System.out.println("LCA is " + lca.data);
		} else {
			System.out.println("LCA do not exist");
		}
	}
}