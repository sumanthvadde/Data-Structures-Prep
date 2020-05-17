import java.util.PriorityQueue;

class Node implements Comparable
{

	private int value;
	private int listNum;
	private int index;

	Node(int value, int listNum, int index) {
		this.value = value;
		this.listNum = listNum;
		this.index = index;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getListNum() {
		return listNum;
	}

	public int compareTo(Object o) {
		Node node = (Node)o;
		return value - node.value;
	}
};

class MergeMList
{

	public static void printSorted(int[][] list)
	{
		
		PriorityQueue<Node> pq = new PriorityQueue();
		for (int i = 0; i < list.length; i++) {
			pq.add(new Node(list[i][0], i, 0));
		}
		while (!pq.isEmpty())
		{
			
			Node min = pq.poll();

			System.out.print(min.getValue() + " ");

			if (min.getIndex() + 1 < list[0].length)
			{
				min.setIndex(min.getIndex() + 1);
				min.setValue(list[min.getListNum()][min.getIndex()]);
				pq.add(min);
			}
		}
	}

	public static void main(String[] args)
	{
		int[][] list =
		{
			{ 10, 20, 30, 40 },
			{ 15, 25, 35, 45 },
			{ 27, 29, 37, 48 },
			{ 32, 33, 39, 50 },
			{ 16, 18, 22, 28 }
		};

		printSorted(list);
	}
}