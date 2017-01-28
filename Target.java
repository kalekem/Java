package kalekem;

public class Target {
	public static void main(String[] args){
		
		int[] nums = {2,7,11,15};
		int target = 9;
		
		System.out.println(solutions(nums, target).toString());
			
		}
	
	public static int[] solutions(int[] array, int target){
		
		int[] index = {};
		int i;
		for (i =1; i<array.length; i++){
			if(array[i]+array[i-1] == target){
				System.out.print(i);
			}
		}
		return index;
		
	}

}
