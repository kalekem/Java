package kalekem;

//import java.util.*;
public class LeetCode {
	public static void main(String[] args) {
		
		//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
		//You may assume that each input would have exactly one solution.
		//Because nums[0] + nums[1] = 2 + 7 = 9,
		//return [0, 1].
				
		int[] nums ={11,2,7,15};
		int target = 9;
		
		for (int i = 0; i<nums.length-1; i++){
			if(nums[i]+nums[i+1] == target){
				System.out.println(i);
			}
			//System.out.println(nums[i]);
		}
	}

}
