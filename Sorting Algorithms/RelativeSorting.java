import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Comparator;

class Comp implements Comparator<Integer>
{
	private Map<Integer, Integer> map;
	public Comp(Map<Integer, Integer> map) {
		this.map = map;
	}

	public int compare(Integer x, Integer y)
	{
		if (map.containsKey(x) && map.containsKey(y)) {
			return map.get(x) - map.get(y);
		}
		else if (map.containsKey(y)) {
			return 1;
		}
		else if (map.containsKey(x)) {
			return -1;
		}
		else {
			return x - y;
		}
	}
}

class RelativeSorting
{
	public static void main(String[] args)
	{
		
		Integer[] first = { 5, 8, 9, 3, 5, 7, 1, 3, 4, 9, 3, 5, 1, 8, 4 };
		Integer[] second = { 3, 5, 7, 2 };

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < second.length; i++) {
			map.put(second[i], i);
		}
		Arrays.sort(first, new Comp(map));
		System.out.println(Arrays.toString(first));
	}
}