// Data structure to store a Binary Search Tree node
class Node
{
	int data;
	Node left = null, right = null;

	Node(int data) {
		this.data = data;
	}
}

class DeletionBST
{
	public static void inorder(Node root)
	{
		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	public static Node maximumKey(Node ptr)
	{
		while (ptr.right != null) {
			ptr = ptr.right;
		}
		return ptr;
	}
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

	// Function to delete node from a BST
	public static Node deleteNode(Node root, int key)
	{
		// base case: key not found in tree
		if (root == null) {
			return null;
		}

		// if given key is less than the root node, recur for left subtree
		if (key < root.data) {
			root.left = deleteNode(root.left, key);
		}

		// if given key is more than the root node, recur for right subtree
		else if (key > root.data) {
			root.right = deleteNode(root.right, key);
		}

		// key found
		else
		{
			// Case 1: node to be deleted has no children (it is a leaf node)
			if (root.left == null && root.right == null) {
				// update root to null
				return null;
			}

			// Case 2: node to be deleted has two children
			else if (root.left != null && root.right != null)
			{
				// find its in-order predecessor node
				Node predecessor = maximumKey(root.left);

				// Copy the value of predecessor to current node
				root.data = predecessor.data;

				// recursively delete the predecessor. Note that the
				// predecessor will have at-most one child (left child)
				root.left = deleteNode(root.left, predecessor.data);
			}

			// Case 3: node to be deleted has only one child
			else
			{
				// find child node
				Node child = (root.left != null) ? root.left: root.right;
				root = child;
			}
		}

		return root;
	}

	public static void main(String[] args)
	{
		Node root = null;
		int[] keys = { 17, 13, 22, 18, 1, 25 };

		for (int key : keys) {
			root = insert(root, key);
		}

		root = deleteNode(root, 12);
		inorder(root);
	}
}