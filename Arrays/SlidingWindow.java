
public class SlidingWindow {
		static int maxSumNaive(int arr[], int n, int k) {
			if(n<k) {
				return -1;
			}
			
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n-k+1;i++) {
				int sum=0;
				for(int j=0;j<k;j++) {
					sum=sum+arr[i+j];
				}
				if(max<sum) {
					max=sum;
				}
			}
			return max;
		}
		static int maxSum(int arr[], int n, int k) {
			if(n<k) {
				return -1;
			}
			int max_sum=0;
			
			for(int i=0;i<k;i++) {
				max_sum+=arr[i];
			}
			int window_sum = max_sum; 
	        for (int i = k; i < n; i++) { 
	            window_sum += arr[i] - arr[i - k]; 
	            max_sum = Math.max(max_sum, window_sum); 
	        } 
	        
	  
	        return max_sum;
			
			
		}
		public static void main(String args[]) {
			int arr[]= new int[] {1, 4, 2, 10, 2, 3, 1, 0, 20 };
			int max=maxSum(arr,arr.length, 4);
			System.out.println(max);
		}
}
