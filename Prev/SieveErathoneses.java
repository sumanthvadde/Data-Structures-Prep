
public class SieveErathoneses {
	static void primeNums(int n) {
	boolean prime[]= new boolean[n+1];
	for(int i=0;i<n;i++) {
		prime[i]=true;
	}
	for(int p=2;p*p<=n;p++) {
		if(prime[p]=true) {
			for(int j=p*p;j<=n;j=j+p) {
					prime[j]=false;
			}
		}
	}
	for(int i=2; i<prime.length;i++) {
		if(prime[i]==true) {
			System.out.print(i+" ");
		}
	}
}
	public static void main(String args[]) {
		int n=30;
		primeNums(n);
		
	
}}
