package kalekem;

import java.util.*;
public class Average {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum =0;
		int avg = 0;
		
		int grades[] = {67, 98, 92, 27, 87};
	
		for (int i=0; i<grades.length; i++){
			sum = sum + grades[i];
		}
		
		System.out.println("The sum of all the grades = "+ sum);
		
		avg = sum/ grades.length;
		
		System.out.println("The average for the quiz grades = "+ avg);
	
		doWhile(input);
		arrayTest();
	}
	
	public static void doWhile(Scanner scan){
		
		int grades;
		int sum = 0;
		int count = 0;
		
		System.out.println("Enter your quiz grades: ");
		do {
			grades = scan.nextInt();
			count = count + 1;
			sum = sum + grades;
		
		} while (grades !=0);
		System.out.println("The total number of grades = " + (count-1) );
		System.out.println("The sum of the quiz grades = " + sum );
		System.out.println("The avarege of the quiz grades = " + sum/(count-1) );
		
	}
	
	public static void arrayTest(){
		
		int i = 1;
		int[] nums = {};
		while(i < 50){
			nums[i]= i;
			i++;
			System.out.println(nums[i]);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
