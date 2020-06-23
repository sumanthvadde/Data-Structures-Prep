import java.util.Deque; 
import java.util.LinkedList; 
public class MaxInSubarray {
	
	    static void printMax(int arr[], int n, int k) 
	    { 
	        
	        Deque<Integer> Qi = new LinkedList<Integer>(); 
	  
	 
	        int i; 
	        for (i = 0; i < k; ++i) { 
	           
	            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) 
	                Qi.removeLast(); // Remove from rear 
	  
	            // Add new element at rear of queue 
	            Qi.addLast(i); 
	        } 
	  
	        // Process rest of the elements, i.e., from arr[k] to arr[n-1] 
	        for (; i < n; ++i) { 
	            
	            System.out.print(arr[Qi.peek()] + " "); 
	
	            while ((!Qi.isEmpty()) && Qi.peek() <= i - k) 
	                Qi.removeFirst(); 
	  
	             
	            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) 
	                Qi.removeLast(); 
	  
	            
	            Qi.addLast(i); 
	        } 
	  
	       
	        System.out.print(arr[Qi.peek()]); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        int arr[] = { 12, 1, 78, 90, 57, 89, 56 }; 
	        int k = 3; 
	        printMax(arr, arr.length, k); 
	    } 
	} 

