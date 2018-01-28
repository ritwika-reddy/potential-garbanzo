package arrays_and_strings;

public class Problem1_a {

	/*
	 * Implement an algorithm to determine if a string has all unique characters
	 * */
	
	// Assume that the string contains only lower case letters. Then form a 
	// hash table with the chars as keys and keep adding the chars to the hash
	// until you find that it was already inserted earlier. A simple form 
	// of hash table would be using a boolean array with the ascii values of the 
	// chars as the indices into the array. 
	
	public boolean isUnique(String str) {
		// ASCII characters have 7 bit codes. We can get them by converting the 
		// character to an integer or byte. 
		
		// An important check here can be that if the length of the string 
		// is greater than 128 then there has to be a repeated character.
		// Since the number of ASCII codes available is 128. So they should
		// be enough to encode all the characters in the string. 
		
		boolean present[] = new boolean[128] ;
		int len = str.length();
		if(len > 128)
			return false;
		char c;
		for(int i=0; i <len; i++ ) {
			c = str.charAt(i);
			if(present[(int)c])
				return false;
			else
				present[(int)c] = true;
		}
		return true;
	}
	
}
