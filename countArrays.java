package reviews;

import java.util.List;

public class countArrays {

	public static void main(String[] args) {
		int[] nums = {5, 2, 6, 1};
		
		System.out.println(countSmaller(nums));
	}
		@SuppressWarnings("null")
		public static List<Integer> countSmaller(int[] nums) {
			
			List<Integer> newArray = null;
			
			int count = 0;
			
			int curr = nums[0];
			int curr2 = nums[1];
			int curr3 = nums[2];
			int curr4 = nums[3];
			
			for(int i=0; i<nums.length; i++){
				if(curr > nums[i]){
					count ++;
					newArray.add(count);
				}
				if(curr2 > nums[i]){
					count ++;
					newArray.add(count);
				}
				if(curr3 > nums[i]){
					count ++;
					newArray.add(count);
				}
				if(curr4 > nums[i]){
					count ++;
					newArray.add(count);
				}
			
			}
			return null;
	}

}
