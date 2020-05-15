
public class ReplaceByGreaterElementOnRight {
	public static void main(String args[]) {
		int arr[]= new int[] {10,20,30,10,5,22};
		int size= arr.length;
		int max_from_right = arr[size-1]; 
		arr[size-1]=-1;
		for(int i=size-2;i>=0;i--) {
			int temp = arr[i];    
	        arr[i] = max_from_right;    
	        if(max_from_right < temp)  
	        max_from_right = temp; 
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
