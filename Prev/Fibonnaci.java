
public class Fibonnaci {
	static int fib(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		int a=0;
		int b=1;
		int sum=a+b;
		while(n>1) {
			sum=a+b;
			a=b;
			b=sum;
			n--;
		}
		return sum;
	}
	public static void main(String args[]) {
		System.out.println(fib(2));
	}

}
