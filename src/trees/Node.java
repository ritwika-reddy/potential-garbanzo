package trees;

public class Node {
	public Node left; 
	public Node right; 
	public int data;
	
	public Node(int x) {
		 left = null; 
		 right = null;
		 data = x; 
	}
	
	public String handleNulls(Node n) {
		if(n==null)
			return "null";
		else
			return n.toString(); 
	}

	@Override
	public String toString() {
	    String l,r; 
	    l = handleNulls(left); 
	    r = handleNulls(right); 
	    
	    return l + " l " + data + " r " + r ;
	}
}
