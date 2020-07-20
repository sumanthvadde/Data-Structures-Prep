
public class RemoveElement {
	static int getResult(int arr[], int val) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=val) {
				arr[j++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		return j;
	}
	public static void main(String args[]) {
		int arr[]= new int[] {50,20,50,40,50};
		System.out.println(getResult(arr,50));
	}

}
