package com.io.riyaz;

import java.util.HashMap;
import java.util.Map;

/**
 * @description :Given an array of integers nums and an integer target, return indices of the two numbers 
 * such that they add up to target.You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * You can return the answer in any order.
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].

 * @author riyaz.ahmed
 *
 */
public class Ch02TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,3,7,4,8};
		int target =7;
		int[] result =getTwoSum(numbers,target);
		System.out.println(result[0] +" " + result[1]);

	}
	
	public static int[] getTwoSum(int numbers[],int target) {
		Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();
		for (int i=0; i<numbers.length; i++) {
			int temp = target-numbers[i];
			
			if(numMap.containsKey(temp)) {
				return new int [] {i,numMap.get(temp)};
			}
			numMap.put(numbers[i], i);
		}
		
		return new int[] {-1,-1};
	}

}
