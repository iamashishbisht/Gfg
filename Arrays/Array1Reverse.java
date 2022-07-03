/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Array1Reverse {
	public static void main (String[] args) {
		
		Scanner c = new Scanner(System.in);
		int a = c.nextInt();
		for(int t =0 ; t < a ; t++){
    		
    		int n = c.nextInt();
    		int arr[]= new int[n];
    		
    		for (int i=0 ; i< n ; i++){
    		    arr[i]= c.nextInt();
    		}
    		
    		for(int i =0 ; i< n/2 ; i++){
    		    
    		    int temp = arr[i];
    		    arr[i] = arr[n-1-i];
    		    arr[n-1-i] = temp;
    		}
    		
    	//	System.out.println("\nafter swapping : ");
    		for (int i =0; i< n; i++){
    		    System.out.print(arr[i]);
    		    System.out.print(" ");
    		}
		}
	}
}