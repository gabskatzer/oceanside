package algorithms;

import java.util.ArrayList;
import java.util.List;

public class palindrome {
//	A palindrome is a string that reads the same forward and backward"
//
//	For example: radar or madam
//
//	Your task is to design an optimal algorithm for checking whether a given string is palindrome or not! 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String toCheck = "otto";
//		System.out.println(isPalindrome(toCheck));
		System.out.println(reverseSentence("Ximun es lindo"));

	}
	
	 public static String reverseWord(String word) {
		String newWord = "";
		
		
		for(int i=0; i < word.length(); i++) {
			
			int helper = (word.length()-1 -i);
			Character c = word.charAt(helper);
			newWord = newWord.concat(c.toString());
		}
		
		return newWord;
	}
	
	public static boolean isPalindrome(String word) {
		
		String fromReverse = reverseWord(word);
		
		if(word.equals(fromReverse)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static String reverseSentence(String sentence) {
		List<String> splitWords = new ArrayList<String>();
		String result = "";
		for(String element: sentence.split(" ")) {
			splitWords.add(element);
		}
		for(String element2: splitWords) {
			result = result.concat(reverseWord(element2).concat(" "));
			
		}
		
		return result;
	}

}
