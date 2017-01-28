package kalekem;

public class Smallest {

	public static void main(String[] args) {
		
		int[] input = {2,3,4,5,6,7,10,9,8,7};
		
		findMin(input);
		

	}

	private static void findMin(int[] input) {
		
		int min = input[0];
		
		for(int i =0; i<input.length; i++){
			if(input[i]<min){
				min = input[i];
			}
		}
		
		System.out.println("Min : "+ min);
		
		for(int i =0; i<input.length; i++){
			if(input[i]>min){
				min = input[i];
			}	
		}
		System.out.println("Max : "+ min);
	}

}
