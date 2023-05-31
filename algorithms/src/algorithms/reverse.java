package algorithms;

import java.util.Arrays;

public class reverse {

	public static void main(String[] args) {
		int nums[] = {1,10,5,4,2,14,3,59,7,9,58};
		reverse reverse = new reverse();
		System.out.println(Arrays.toString(reverse.solve(nums)));
	}
	
	public int[] solve(int[] nums) {
		int[] newArray = new int[nums.length];
		
		for(int i=0; i < nums.length; i++) {
			
			int helper = (nums.length-1 -i);
			
			newArray[i] = nums[helper];
		}
		
		return newArray;
	}

}
