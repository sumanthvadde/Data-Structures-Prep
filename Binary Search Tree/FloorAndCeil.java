class Node
{
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
	}
}

class FloorCeil
{
	private Node floor, ceil;

	FloorCeil() {
		floor = new Node(-1);
		ceil = new Node(-1);
	}

	public void setCeil(Node ceil) {
		this.ceil = ceil;
	}

	public void setFloor(Node floor) {
		this.floor = floor;
	}

	public int getCeilData() {
		return ceil.data;
	}

	public int getFloorData() {
		return floor.data;
	}
}

class FloorAndCeil
{
	// Recursive function to insert a key into BST
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

	// Recursive function to find floor and ceil of a given key in a BST
	public static void findFloorCeil(Node root, FloorCeil obj, int key)
	{
		// base case
		if (root == null) {
			return;
		}


		if (root.data == key)
		{
			obj.setFloor(root);
			obj.setCeil(root);
		}

		else if (key < root.data)
		{
			obj.setCeil(root);
			findFloorCeil(root.left, obj, key);
		}

		else
		{
			obj.setFloor(root);
			findFloorCeil(root.right, obj, key);
		}
	}

	public static void main(String[] args)
	{

		int[] keys = { 2, 4, 6, 8, 9, 10, 12 };

		Node root = null;
		for (int key : keys) {
			root = insert(root, key);
		}

		// calculate ceil and floor for each key
		for (int i = 0; i < 15; i++)
		{
			FloorCeil ob = new FloorCeil();

			findFloorCeil(root, ob, i);
			System.out.println(i + " -> Floor is " + ob.getFloorData() +
							", Ceil is " + ob.getCeilData());
		}
	}
}