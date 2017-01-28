package kalekem;

import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		   /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
	       Scanner scan = new Scanner(System.in);
	       System.out.print("Enter the size of the elements: ");
	       int size = scan.nextInt();
	        
	        System.out.print("Enter the array of integer numbers: ");
	        
	        int[] num = new int[size];
	        
	        for(int i =0 ; i<num.length; i++){
	        	num[i]= scan.nextInt();
	            
	        }     
	        for(int i = num.length-1; i>=0 ; i--){
	            System.out.print(num[i]+ " ");
	        }
	        scan.close();
	    }

}
