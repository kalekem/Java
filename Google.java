package kalekem;

public class Google {

	public static void main(String[] args) {
		
		int[] a = { -1,3,-4,5,1,-6,2,1};
		
		System.out.println(solution(a));
	}
	public static int solution(int[] A) {
		
		int p = A[0];
		int sum =0;
		int i;
	
		for( i=1; i<A.length; i++){
			
			sum +=A[i];
			
			if(p == sum ){
				return i;
				
			}
			else{
				p = A[i-1] ;
				sum += A[i];
			}
			if (p ==sum){
				return i;
			}
			
			}
			
		return i;
		        

		        // write your code in Java SE 8

	}

}
