import java.util.*;

class SelectionSort
{
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void selectionSort(int[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{

			int min = i;

			for (int j = i + 1; j < arr.length; j++)
			{
			
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			swap(arr, min, i);
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 7, 51, 18, 34, 13, -9, -12 };

		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}