
public class DutchNationalFlag {
	static int[] sort012(int arr[], int n) {
		int low=0;
		int mid=0;
		int high= n-1;
		while(high>=mid) {
			switch(arr[mid]) {
			case 0:
				int temp= arr[low];
				arr[low]= arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			
			case 2:
				temp= arr[mid];
				arr[mid]= arr[high];
				arr[high]=temp;
				high--;
				break;
				
		}
	}
		return arr;
	}
	
	public static void main(String args[]) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
        int arr_size = arr.length; 
        sort012(arr, arr_size); 
        System.out.println("Array after seggregation ");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        
	}
}