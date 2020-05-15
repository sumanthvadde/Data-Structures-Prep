/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class RelativeSorting {
    static int first(int arr[], int low, int high, 
                     int x, int n) 
    { 
        if (high >= low) { 
            int mid = low + (high - low) / 2; 
  
            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) 
                return mid; 
            if (x > arr[mid]) 
                return first(arr, (mid + 1), high, 
                             x, n); 
            return first(arr, low, (mid - 1), x, n); 
        } 
        return -1; 
    } 
    static void sortAccording(int A1[], int A2[], int m, int n) { 
        int temp[] = new int[m], visited[] = new int[m]; 
        for (int i = 0; i < m; i++) { 
            temp[i] = A1[i]; 
            visited[i] = 0; 
        } 
        Arrays.sort(temp); 
  
        // for index of output which is sorted A1[] 
        int ind = 0; 
  
        // Consider all elements of A2[], find them 
        // in temp[] and copy to A1[] in order. 
        for (int i = 0; i < n; i++) { 
            // Find index of the first occurrence 
            // of A2[i] in temp 
            int f = first(temp, 0, m - 1, A2[i], m); 
  
            // If not present, no need to proceed 
            if (f == -1) 
                continue; 
  
            // Copy all occurrences of A2[i] to A1[] 
            for (int j = f; (j < m && temp[j] == A2[i]); 
                 j++) { 
                A1[ind++] = temp[j]; 
                visited[j] = 1; 
            } 
        } 
        for (int i = 0; i < m; i++) 
            if (visited[i] == 0) 
                A1[ind++] = temp[i]; 
    } 
    static void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }
  
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int m=sc.nextInt();
		    int n= sc.nextInt();
		    int A[] = new int[m];
		    int B[]= new int[n];
		    for(int i=0;i<m;i++){
		        A[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        B[i]=sc.nextInt();
		    }
		    sortAccording(A,B,m,n);
		    printArray(A, m); 
		}
	}
}