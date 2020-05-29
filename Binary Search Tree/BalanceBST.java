import java.util.Arrays;

class Node
{
	int data;
	Node left = null, right = null;

	Node(int data) {
		this.data = data;
	}
}

class BalanceBST
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
	public static Node convert(int[] keys, int low, int high, Node root)
	{
		// base case
		if (low > high) {
			return root;
		}
		int mid = (low + high) / 2;

	
		root = new Node(keys[mid]);
		root.left = convert(keys, low, mid - 1, root.left);
		root.right = convert(keys, mid + 1, high, root.right);

		return root;
	}
	public static Node convert(int[] keys)
	{
		Arrays.sort(keys);
		return convert(keys, 0, keys.length - 1, null);
	}

	
	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

		// construct balanced binary search tree
		Node root = convert(keys);

		// print the keys in in-order fashion
		inorder(root);
	}
}