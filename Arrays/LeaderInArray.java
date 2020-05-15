
import java.util.*;
import java.lang.*;
import java.io.*;

class LeaderInArray {
	public static void main (String[] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int t = Integer.parseInt(br.readLine());
		    
		    while(t-->0)
		    {   
		        int n = Integer.parseInt(br.readLine());
		        int a[] = new int [n];
		        String array1A[] = br.readLine().split(" ");
		   
		       
		        for(int i =0 ;i<n; i++)
		        {
		            a[i] = Integer.parseInt(array1A[i]);
		        }
		          
		          printLeaders(a,n);  
		    }
	}

	    static void printLeaders(int a[], int n)  
	    {   
	        ArrayList<Integer> al = new ArrayList<>();   
	       int maxSoFar=Integer.MIN_VALUE;
	        for(int i=n-1;i>=0;i--)
	        {
	           if(a[i]>=maxSoFar) 
	           {
	          
	           maxSoFar = a[i];
	           al.add(maxSoFar);
	           
	           }
	           
	        }
	        
	        StringBuffer sb = new StringBuffer();
	        
	        
	        for(int i =al.size()-1;i>=0;i--)
	        {
	            sb.append(al.get(i)+" ");
	        }
	      
	        
	        System.out.println(sb);
	    } 
}
