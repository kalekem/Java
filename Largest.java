package kalekem;

public class Largest {

	public static void main(String[] args) {
	
		int x = 623315;
		
		System.out.println(solution(x));

	}
	
	public static int solution(int num){
		
		String x = Integer.toString(num);
		
		double average = 0;
		double charPosition;
		for (int i = 1; i<x.length(); i++){
			
			charPosition = x.charAt(i)+ x.charAt(i-1);
			average = charPosition/2;
			charPosition = Math.ceil(average);
			
			
		}
		if( average > num){
			average = num;
		}
		return (int) average;
	}
}
