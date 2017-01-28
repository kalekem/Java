package reviews;

public class Reverse {

	public static void main(String[] args) {
		String s= "the sky is blue";
		System.out.println(reverse(s));

	}
	public static String reverse(String s){
		
		String reverse="";
		for (int i=s.length(); i>0; i--){
			reverse+=s.charAt(i-1);	
		}
		return reverse;
		
	}

}
