package algorithms;

import java.util.ArrayList;
import java.util.List;

public class StringExercise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(""));
		
	}
	
	public static boolean isPalindrome(String word) {
		
		if(word.equals("")) {
			return false;
		}
		for(int i = 0; i < word.length()/2; i++) {
			int x = i;
			int y = word.length() -1 - i;
			if(word.charAt(x) != word.charAt(y)) {
				return false;
			}	
		}
		
		return true;
		
	}

}
