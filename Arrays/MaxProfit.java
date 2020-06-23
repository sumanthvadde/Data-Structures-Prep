class MaxProfit
{
	
	public static int maxPro(int[] price)
	{
		
		int profit = 0;

		
		int j = 0;

		
		for (int i = 1; i < price.length; i++)
		{
			
			if (price[i - 1] > price[i]) {
				j = i;
			}

			if (price[i - 1] <= price[i] &&
				(i + 1 == price.length || price[i] > price[i + 1]))
			{
				profit += (price[i] - price[j]);
				System.out.printf("Buy on day %d and sell on day %d\n", j + 1, i + 1);
			}
		}

		return profit;
	}

	public static void main(String[] args)
	{
		int[] price = { 1, 5, 2, 3, 7, 6, 4, 5 };

		System.out.print("\nTotal profit earned is " + maxPro(price));
	}
}