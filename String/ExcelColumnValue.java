import java.util.Random;

class ExcelColumnValue
{
	public static String getColumnName(int n)
	{
		// initalize output String as empty
		StringBuilder res = new StringBuilder();

		while (n > 0)
		{
			int index = (n - 1) % 26;
			res.append((char)(index + 'A'));
			n = (n - 1) / 26;
		}

		return res.reverse().toString();
	}

	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			int r = new Random().nextInt(1000) + 1;
			System.out.println(r + " - " + getColumnName(r));
		}
	}
}