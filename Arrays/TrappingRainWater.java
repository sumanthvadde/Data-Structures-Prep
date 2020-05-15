
public class TrappingRainWater {
	int findWaterNaive(int arr[], int n) 
	{ 
	    
	    int left[]= new int[n]; 
	  
	    int right[]= new int[n]; 
	  
	    // Initialize result 
	    int water = 0; 
	  
	    // Fill left array 
	    left[0] = arr[0]; 
	    for (int i = 1; i < n; i++) 
	        left[i] = Math.max(left[i - 1], arr[i]); 
	  
	    // Fill right array 
	    right[n - 1] = arr[n - 1]; 
	    for (int i = n - 2; i >= 0; i--) 
	        right[i] = Math.max(right[i + 1], arr[i]); 
	    
	    for (int i = 0; i < n; i++) 
	        water += Math.min(left[i], right[i]) - arr[i]; 
	  
	    return water; 
	} 
	  
	
	
	
	static int findWater(int arr[], int n) 
	{ 
	    // initialize output 
	    int result = 0; 
	  
	    // maximum element on left and right 
	    int left_max = 0, right_max = 0; 
	  
	    // indices to traverse the array 
	    int lo = 0, hi = n - 1; 
	  
	    while (lo <= hi) { 
	        if (arr[lo] < arr[hi]) { 
	            if (arr[lo] > left_max) 
	                // update max in left 
	                left_max = arr[lo]; 
	            else
	                // water on curr element = max - curr 
	                result += left_max - arr[lo]; 
	            lo++; 
	        } 
	        else { 
	            if (arr[hi] > right_max) 
	                // update right maximum 
	                right_max = arr[hi]; 
	            else
	                result += right_max - arr[hi]; 
	            hi--; 
	        } 
	    } 
	  
	    return result; 
	} 
	public static void main(String args[]) {
		int arr[]= new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.print(findWater(arr, arr.length));
	}
}
