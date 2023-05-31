package palindrome;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toCheck = "otto";
		System.out.println(toCheck);
		System.out.println(reverseWord(toCheck));
	}
	static public String reverseWord(String word) {
	String newWord = "";
	
	
	for(int i=0; i < word.length(); i++) {
		
		int helper = (word.length()-1 -i);
		Character c = word.charAt(helper);
		newWord.concat(c.toString());
	}
	
	
	
	return newWord;
}

}
