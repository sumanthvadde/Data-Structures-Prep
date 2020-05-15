import java.util.Arrays;
import java.util.*;

public class MinMaxSlidingWindows {
	static void minMaxNaive(int arr[], int k) {
		LinkedList<Integer> ll1= new LinkedList<Integer>();
		LinkedList<Integer> ll2= new LinkedList<Integer>();
		for(int i=0;i<arr.length-k+1;i++) {
			int min=arr[i],max=arr[i];
			for(int j=0;j<k;j++) {
				if(max<arr[i+j])
					max=arr[i+j];
				if(min>arr[i+j]) 
					min=arr[i+j];
			}
			ll1.add(min);
			ll2.add(max);
		}
		
		 Iterator<Integer> itr1=ll1.iterator();  
		  while(itr1.hasNext()){  
		   System.out.print(itr1.next()+" ");  
		  }  
		
		System.out.println();
		Iterator<Integer> itr2=ll2.iterator();  
		  while(itr2.hasNext()){  
		   System.out.print(itr2.next()+" ");  
		  }
		
	}
	public static void main(String args[]) {
		int arr[]= new int[] {10,20,43,23,88,1,10,20,30};
		minMaxNaive(arr, 3);
	}

}
