
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class RearrangeElements{
    public static void getResult(int arr[], int n){
        if(n==1){
		    System.out.println(arr[0]);
		 }
		    int i=0; 
		    int j=n-1;
		    int temp=0;
		    int res[]= new int[n];
		    while(i<j){
		        res[temp++]=arr[j];
		        j--;
		        res[temp++]=arr[i];
		        i++;
		        if(i==j){
		            res[temp++]=arr[j];
		            break;
		        }
		    }
		    for(int a=0;a<n;a++){
		        System.out.print(res[a]+" ");
		    }
    }
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int n= sc.nextInt();
		    int arr[]= new int[n];
		    for(int a=0;a<n;a++){
		        arr[a]=sc.nextInt();
		    }
		    getResult(arr,n);
		    System.out.println();
		    
		}
	}
}