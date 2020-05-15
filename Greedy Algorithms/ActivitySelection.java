import java.util.*;

class Pair
{
	private int start, finish;

	public Pair(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}

	public int getFinish() {
		return finish;
	}

	public int getStart() {
		return start;
	}

	@Override
	public String toString() {
		return "{" + getStart() + ", " + getFinish() + "}";
	}
};

class ActivitySelection
{

	public static Set<Integer> selectActivity(List<Pair> activities)
	{
		int k = 0;

		
		Set<Integer> out = new HashSet<>();
		out.add(0);
		for (int i = 1; i < activities.size(); i++)
		{
			
			if (activities.get(i).getStart() >= activities.get(k).getFinish())
			{
				out.add(i);
				k = i;
			}
		}

		return out;
	}

	public static void main(String[] args)
	{
		
		List<Pair> activities = Arrays.asList(new Pair(1, 4), new Pair(3, 5),
				new Pair(0, 6), new Pair(5, 7), new Pair(3, 8),
				new Pair(5, 9), new Pair(6, 10), new Pair(8, 11),
				new Pair(8, 12), new Pair(2, 13), new Pair(12, 14));

		Collections.sort(activities, (a, b) -> a.getFinish() - b.getFinish());

		Set<Integer> res = selectActivity(activities);

		for (Integer i: res) {
			System.out.println(activities.get(i));
		}
	}
}