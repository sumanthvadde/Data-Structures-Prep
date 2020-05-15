
public class MaxConsecutiveOnes {
	
	static int getResult(int arr[], int k) {
		int i=0;
		int j=0;
		while(i<arr.length) {
			if(arr[i]==0) k--;
			if(k<0 && arr[j++]==0)k++;
			i++;
		}
		return i-j;
	}
	public static void main(String args[]) {
		
	}
}
