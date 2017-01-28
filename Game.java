package games;

import java.util.*;
public class Game {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		boolean running=true;
		boolean guessed=true;
		
		int number=0;
		int input=0;
		
		while(running){
			if(guessed){
				System.out.println("I have chosen a random value");
				System.out.println("Have a go at guessing it");
				number=getRandom(9);
				guessed=false;
			}
			else{
				System.out.println("Please try again");
			}
			
			input=sc.nextInt();
			
			if (input==-1){
				running=false;
			}
			else{
				guessed=input==number;
			}
		}
		sc.close();

	}
	public static int getRandom(int max){
		return (int) (Math.random()*max)+1;
	}

}












