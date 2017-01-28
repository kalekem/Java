package kalekem;

public class StairCase {

	public static void main(String[] args) {
		
		int num = 6;
		show(num);
		

	}

	private static void show(int num) {
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num; j++){
				if((i+j)>num)
			    {
			    System.out.print("#");
			    }
			    else
			    {
			     System.out.print(" ");
			    }
		}
			System.out.println("");
		
	}
	}

}
