package algorithms;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(45);
		nums.add(56);
		nums.add(3);
		nums.add(7);
		
		List<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(2);
		nums2.add(5);
		nums2.add(6);
		nums2.add(3);
		nums2.add(7);
		
//		System.out.println("Total values in the list is: " + countNums(nums));
//		System.out.println("Numbers greater than " + countOver(nums, 10) + " are " + nums);
//		System.out.println("Odds numbers are: " + countOdds(nums));
//		System.out.println(sum(nums));
//		System.out.println(average(nums));
//		System.out.println(listOfOdds(nums));
//		System.out.println(reverse(1234));
//		System.out.println(removeRepeatedCharacters("carril"));
//		System.out.println(intersect(nums, nums2));
		System.out.println(maxValue(nums));
		System.out.println(minValue(nums));
		
	}
	
	private static Integer countNums(List<Integer> listInput) {
		
		int counter = 0;
		for(int element : listInput) {
				counter++;
		}
		return counter; 
	}
	
	private static Integer countOver(List<Integer> listInput, Integer number) {
		
		int counter = 0;
		for(int element : listInput) {
			if(element > number) {
				counter++;
			}
				
		}
		return counter; 
	}
	
	private static Integer countOdds(List<Integer> listInput) {
		
		int counter = 0;
		for(int element : listInput) {
			if(element%2 != 0) {
				counter++;
			}			
		}
		return counter; 
	}
	
	private static Integer sum(List<Integer> listInput) {
		int result = 0;
		for(int i =0; i < listInput.size(); i++) {
			
			result = result + listInput.get(i);
		}
		return result;
	}
	
	//average: sum of numbers / total of numbers
	public static Integer average(List<Integer> listInput) {
		int totalOfNumbers = listInput.size();
		int result = sum(listInput) / totalOfNumbers;
		return result;
	}
	
	private static List<Integer> listOfOdds(List<Integer> listInput) {
		List<Integer> result = new ArrayList<Integer>();
		for(int element : listInput) {
			if(element%2 != 0) {
				result.add(element);
			}			
		}
		return result; 
	}
	
	private static Integer lastNumber(List<Integer> listInput) {
		int result = 0;
		int position = listInput.size() - 1;
		result = listInput.get(position);
		return result;
	}
	
	public static int reverse(int n) {
	        
	        int reversed = 0;
	        Integer inputNumber = n;
	        String helper = inputNumber.toString();
	        String beforeResult = "";
	        
	        for(int i = 0; i < helper.length(); i++) {
	        	int indexValue = helper.length()-1 - i;
	        	Character c = helper.charAt(indexValue);
	        	beforeResult = beforeResult + c;
	        }
	        reversed = Integer.parseInt(beforeResult);
	        return reversed;
	    }
	public static String removeRepeatedCharacters(String word) {
		String result = "";
		
		for(int i = 0; i < word.length(); i++) {
			int lastIndex= word.length() - 1;
			if(i == lastIndex || word.charAt(i) != word.charAt(i + 1)) {
				result = result + word.charAt(i);
			}
			System.out.println(result);
		}
		
		
		return result;
	}
	
	public static List<Integer> intersect(List<Integer> listA, List<Integer> listB){
		
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < listA.size(); i++) {
			for(int j = 0; j < listB.size(); j++) {
				if(listA.get(i) == listB.get(j)) {
					result.add(listA.get(i));
				}
			}
		}
		
		return result;
	}
	
	public static int maxValue(List<Integer> listNum){
		int helper = 0;
		for(int i = 0; i < listNum.size(); i++) {
			if(listNum.get(i) > helper) {
				helper = listNum.get(i);
			}
		}
		return helper;
	}
	
	public static int minValue(List<Integer> listNum){
		int helper = Integer.MAX_VALUE;
		for(int i = 0; i < listNum.size(); i++) {
			if(listNum.get(i) < helper) {
				helper = listNum.get(i);
			}
		}
		return helper;
	}
}
