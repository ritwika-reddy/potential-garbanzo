package trees;

// Implement a function to check if a tree is balanced or not. 
// Here a balanced tree is defined to be one in which the heights 
// of two subtrees of any node never differ by more than one. 

public class Problem1 {
		
	public int height(Node n) {
		
		/* To check the height of tree rooted at node n,
		 * we need to add 1 ( for the root ) to the max of the 
		 * heights of the left and right subtrees. 
		 * */  
		if(n==null)
			return 0;
		int left_height = height(n.left); 
		int right_height = height(n.right);
		
		// This means that some node in either the left or the right 
		// subtree is not balanced and we need to propagate this information 
		// to the root node. 
		
		if(left_height == -1 || right_height == -1)
			return -1; 
		
		if(Math.abs(left_height-right_height) > 1) {
			return -1; // -1 denotes that the tree rooted at n is not balanced. 
		}		
		else {
			return 1+Math.max(height(n.left), height(n.right));	
		} 
	}
	
	public boolean CheckBalanced(Node n) {
		System.out.println(height(n));
		return height(n) != -1; 
	}
	
}
