package kalekem;

import java.util.*;
public class OddManOut {
	public static void main(String[] args) {
		
		int[] man= {8,9,2, 8, 3, 9, 3};
		
		System.out.println(oddOut(man));
		
		reverseString("abcd");
		
	}
	public static int oddOut(int[] array){
		
		HashSet<Integer> num = new HashSet<Integer>();
		
		int sum = 0;
		
		for(int i =0; i<array.length; i++){
			if(num.contains(array[i])){
				sum = sum - array[i];
			}
			else {
				num.add(array[i]);
				sum = sum + array[i];
			}
		}
		
		return sum;
		
	}
	
	public static void reverseString(String text){
	
		for(int i =text.length()-1; i>=0; i--){
			System.out.print(text.charAt(i));
			
		}
		
		
		
		
		
		
		
		
	}

}
