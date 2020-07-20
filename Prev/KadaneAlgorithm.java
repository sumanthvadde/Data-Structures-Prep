import java.util.*;
import java.lang.*;
import java.io.*;

class KadaneAlgorithm {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int n= sc.nextInt();
		    int arr[]= new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]= sc.nextInt();
		    }
		    int max_so_far=Integer.MIN_VALUE;
			int max_ending_here=0;
			int max_element=Integer.MIN_VALUE;
			
			for(int i=0;i<arr.length;i++) {
				max_ending_here=max_ending_here+arr[i];
				max_element= Math.max(arr[i], max_element);
				if(max_ending_here>max_so_far) {
					max_so_far = max_ending_here ;
				}
				if(max_ending_here<0) {
					max_ending_here=0;
				}
			}
			if(max_so_far==0){
			    max_so_far=max_element;
			}
			System.out.print(max_so_far); 
			System.out.println();
		}
	}
}
