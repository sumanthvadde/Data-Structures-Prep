import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class KLargestNum
{

	public static int FindKthLargest(List<Integer> ints, int k)
	{

		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		// or pass Comparator.reverseOrder()
		pq.addAll(ints);
		while (--k > 0) {
			pq.poll();
		}
		return pq.peek();
	}


	public static void main(String[] args)
	{
		List<Integer> ints = Arrays.asList(7, 4, 6, 3, 9, 1);
		int k = 2;

		System.out.println("K'th largest element in the array is " +
				FindKthLargest(ints, k));
	}
}