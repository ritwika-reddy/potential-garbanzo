package arrays_and_strings;

public class Problem1_b {

	/*
	 * What if we cannot use any additional data structures for this problem ? 
	 * Array is also considered to be an additional data structure. 
	 * 
	 * Brute force - For each character, go through the string to see if it was
	 * seen before it. 
	 * */
	
	/*
	 * See there are only 128 possible values, 0 to 128. This means that 
	 * 
	 * a byte should be able to encode all of this information using its bits. 
	 * 
	 * A byte can encode 258 distinct values. How does this do this ? 
	 * Each combination of the bits represents a character. 
	 * 
	 * */

	/* If you assume that only characters from 'a' to 'z' are used, then 2^26 bits
	 * are needed to encode this information. integer can be used since it can 
	 * store up to 2^32 or 2^64 values depending on if it is signed or unsigned.
	 * */
	
	/* 
	 * The idea is simple really, when the number of unique elements is small, 
	 * you can use a bit in an integer to keep track of these elements.
	 * For the original problem, I think long long integer should be enough 
	 * to store 2^127 bits
	 * 
	 * int - 2^32 
	 * long - 2^64
	 * */
	
	public boolean hasUniqueChars(String str) {
		int len = str.length();
		
		if(len > 26) return false; 
		
		int checker = 0; 
		
		for(int i=0; i<len; i++) {
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) return false;
			
			checker |= 1<<val;
			
		}
		return true; 
	}
	
	
}
