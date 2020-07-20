class Median{

	public static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){

		PriorityQueue<Integer> bigger= lowers.size()>highers.size()? lowers: highers;
		PriorityQueue<Integer> smaller= lowers.size()<highers.size()? highers: lowers;

		if(bigger.size()-smaller.size()>=2){
			smaller.add(bigger.poll());
		}

	}

	public static void add(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers, int num){
		if(lowers.size()==0 || num<lowers.peek()){
			lowers.add(num);
		}
		else{
			higher.add(num);
		}
	}

	public static int median(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
		PriorityQueue<Integer> bigger= lowers.size()>highers.size()? lowers: highers;
		PriorityQueue<Integer> smaller= lowers.size()<highers.size()? highers: lowers;
		if(bigger.size()==smaller.size()){
			return (int) ((bigger.peek()+smaller.peek())/2)
		}
		else{
			return bigger.peek();
		}
	}

	public static void getMedian(int arr[], int n){
		PriorityQueue<Integer> lowers= new PriorityQueue<Integer>(new Comparator<Integer>(){
			public int compare(Integer a, Integer b){
			return b.compareTo(a);
		}});

		PriorityQueue<Integer> highers= new PriorityQueue<Integer>();

		for(int i=0;i<arr.length;i++){
			int num= arr[i];
			add(lowers,highers,num);
			rebalance(lowers,highers);
			System.out.print(median(lowers,highers)+" ");

		}
	}

	public static void main(String args[]){
		int arr[]= new int[]{1,6,9,6,9,5,-1,2,2,8,9};
		getMedian(arr,arr.length);

	}
}