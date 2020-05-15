import java.util.*;
import java.lang.*;
import java.io.*;

class MaxProductSubArray {
    static long maxSubarrayProduct(int arr[], int n) 
    { 
    
    long max_ending_here = arr[0]; 
    long min_ending_here = arr[0]; 
    long max_so_far =arr[0]; 
    for(int i=1;i<n;i++){
        long temp= max_ending_here;
        max_ending_here= Math.max(Math.max(max_ending_here*arr[i],min_ending_here*arr[i]),arr[i]);
        min_ending_here= Math.min(Math.min(temp*arr[i],min_ending_here*arr[i]),arr[i]);
        if(max_ending_here> max_so_far)
            max_so_far= max_ending_here;
    }
   return max_so_far; 
} 
public static void main (String[] args) throws IOException {
		//codeScanner 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		        int n = Integer.parseInt(br.readLine());
		        int a[] = new int[n];
		        String array1A[] = br.readLine().split(" ");
		        for(int i =0 ;i<n; i++)
		        {
		            a[i] = Integer.parseInt(array1A[i]);
		        }
		    System.out.print(maxSubarrayProduct(a,n));
		    System.out.println(); 
	}
}}