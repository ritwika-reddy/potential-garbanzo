package arrays_and_strings;

public class Problem2 {

	/**
	 * Write a function to check if one string is a permutation of the other. 
	 * 
	 * A permutation has all of the characters the same exact number of 
	 * times.
	 * 
	 * */
	
	public boolean permutation(String str1, String str2) {
		int len1 = str1.length(), len2 = str2.length();
		
		if(len1 != len2) return false; 
		int count[] = new int[128];
		for(int i=0; i<len1; i++) {
			count[(int)str1.charAt(i)]+=1;
		}
		
		for(int i=0; i<len2; i++) {
			if(count[(int)str2.charAt(i)] == 0)
				return false;
			count[(int)str2.charAt(i)]--;
		}
		
		return true; 
	}
	
	/**
	 * Correct! One other solution is that the sorted string of the two strings
	 * should give rise to the same string. 
	 * */
	
	
}
