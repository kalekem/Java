package kalekem;

import java.util.Scanner;

public class NyamaChoma implements Runnable {
	
	String hotel;
	String location;
	double price;
	Scanner scan;
	
	public NyamaChoma(){
		scan = new Scanner(System.in);
	}

	public void run() {
		try{
			
			System.out.println("Enter the name of your hotel: ");
			hotel = scan.nextLine();
			System.out.println("Enter the location of your hotel: ");
			location = scan.nextLine();
			System.out.println("Enter the market price of this hotel: ");
			price = scan.nextDouble();
			Thread.sleep(5000);
			System.out.printf(" Hotel Name : %s\n Location: %s\n Market Price: %s\n", hotel, location, price);
			
			
			
			
		}catch(Exception e){
			
		}
		// TODO Auto-generated method stub
		
	}

}
