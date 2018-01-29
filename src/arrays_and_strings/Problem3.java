package arrays_and_strings;

	public class Problem3 {
		
		public void URLify(char input[], int truelength) {
			/** Replace all the spaces in a character array with %20. 
			 * We can assume that there is enough space at the end of the 
			 * array. 
			 * 
			 * Start scanning the array from the end.
			 * 
			 *  Since true length is given, true length - 1 is the index 
			 *  where the string starts, we need to start scanning in reverse
			 *  and shifting these characters to the end of the string.
			 * */
			
	
			int index = input.length ; 
			for(int i=truelength-1; i>=0; i--) {
				if(input[i] == ' ') {
					input[--index] = '0';
					input[--index] = '2'; 
					input[--index] = '%'; 
				}
				else {
					input[--index] = input[i]; 
				}
			}
		}
	}
