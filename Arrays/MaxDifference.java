/*In this method, instead of taking difference of the picked element with every other element, 
 we take the difference with the minimum element found so far. So we need to keep track of 2 things:
1) Maximum difference found so far (max_diff).
2) Minimum number visited so far (min_element).
*/
import java.util.*;
public class MaxDifference {
	int maxDiff(int arr[], int arr_size)  
    { 
        int max_diff = arr[1] - arr[0]; 
        int min_element = arr[0]; 
        int i; 
        for (i = 1; i < arr_size; i++)  
        { 
            if (arr[i] - min_element > max_diff) 
                max_diff = arr[i] - min_element; 
            if (arr[i] < min_element) 
                min_element = arr[i]; 
        } 
        return max_diff; 
    } 
  
    /* Driver program to test above functions */
    public static void main(String[] args)  
    { 
        MaxDifference maxdif = new MaxDifference(); 
        int arr[] = {1, 2, 90, 10, 110}; 
        int size = arr.length; 
        System.out.println("MaximumDifference is " +  
                                maxdif.maxDiff(arr, size)); 
    } 
}
