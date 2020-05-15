import java.util.ArrayDeque;
import java.util.Queue;

class GenBinary
{
	public static void generate(int n)
	{
		
		Queue<String> q = new ArrayDeque<>();
		int i = 1;
		while (i++ <= n)
		{
			q.add(q.peek() + "0");
			q.add(q.peek() + "1");
			System.out.print(q.poll() + ' ');
		}
	}

	
	public static void main(String[] args)
	{
		int n = 16;
		generate(n);
	}
}