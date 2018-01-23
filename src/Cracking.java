import trees.Node;
import trees.Problem1;

public class Cracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cracking the Coding Interview"); 
		Node root = new Node(1); 
		root.left = new Node(2);
		root.left.right = new Node(3); 
		System.out.println(root);

		Problem1 pr1 = new Problem1(); 
		
		System.out.println(pr1.CheckBalanced(root));
		
		
	}
}
