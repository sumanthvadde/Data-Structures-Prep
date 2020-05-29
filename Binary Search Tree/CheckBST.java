
class Node
{
	int data;
	Node left = null, right = null;

	Node(int data) {
		this.data = data;
	}
}

class CheckBST
{
	public static Node insert(Node root, int key)
	{

		if (root == null) {
			return new Node(key);
		}

		if (key < root.data) {
			root.left = insert(root.left, key);
		}
		
		else {
			root.right = insert(root.right, key);
		}

		return root;
	}


	public static boolean isBST(Node node, int minKey, int maxKey)
	{
		if (node == null) {
			return true;
		}

		
		if (node.data < minKey || node.data > maxKey) {
			return false;
		}

		
		return isBST(node.left, minKey, node.data) &&
			isBST(node.right, node.data, maxKey);
	}

	public static void isBST(Node root)
	{
		if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
			System.out.println("This is a BST.");
		} else {
			System.out.println("This is NOT a BST!");
		}
	}

	private static void swap(Node root) {
		Node left = root.left;
		root.left = root.right;
		root.right = left;
	}

	public static void main(String[] args)
	{
		Node root = null;
		int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

		for (int key : keys) {
			root = insert(root, key);
		}

		// swap left and right nodes
		swap(root);
		isBST(root);
	}
}