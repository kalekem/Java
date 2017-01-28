package reviews;

public class BubbleSort {

	public static void main(String[] args) {
		int num[] = {5, 1, 6, 2, 4, 3};
	
		System.out.println(bubbleSort(num));
		
	}
	public static int[] bubbleSort(int[] num){
		
		for(int i=0; i <num.length; i++){
			for(int j=0 ; j <num.length -i -1; j++){
				if(num[j] > num[j+1]){
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1]= temp;
				}
			}
			
		}
		
		return num;
	}
}

