import arrays_and_strings.*;

public class Cracking {

	public static void main(String[] args) {
		
		char input[] = "Mr John Smith      ".toCharArray(); 
		Problem3 p3 = new Problem3(); 
		p3.URLify(input,13);
		String str = input.toString(); 
		System.out.println(str);
	}
}
