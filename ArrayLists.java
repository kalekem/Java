package structures;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		
		//Scanner scan= new Scanner(System.in);
		
		ArrayList<Integer> num=new ArrayList<Integer>();
		
		num.add(100);
		num.add(120);
		num.add(23);
		num.add(129);
		
		for(int i=0; i<=num.size()-1; i++){
			System.out.println(num.get(i));
		}
		
		System.out.println();
		for(int i=0; i<=num.size()-1; i++){
			System.out.println(num.remove(i));
		}
		
		System.out.println();
		//Hashmaps
		
		HashMap<String, String> account=new HashMap<String, String>();
		account.put("ckalekem", "Chewoyet1");
		account.put("brandeis", "Public");
		account.put("boaz", "Kisivuli29");
		account.put("roza", "Ethiopia700");
		
		System.out.println("Enter the key to access the password!");
		System.out.println("ckalekem: "+account.get("ckalekem"));
		System.out.println("brandeis: "+ account.get("brandeis"));
		System.out.println("boaz: "+ account.get("boaz"));
		System.out.println("roza: "+ account.get("roza"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
