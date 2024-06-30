package binarytree;

//Main class to test the binary tree implementation
	public class CompleteBinaryTreeMain {
	    public static void main(String[] args) {
	        BinaryTree tree = new BinaryTree();
	        tree.insert(1);
	        tree.insert(5);
	        tree.insert(3);
	        tree.insert(4);
	        tree.insert(9);
	        tree.insert(6);
	        tree.insert(10);

	        System.out.println("Level order traversal of binary tree:");
	        tree.printLevelOrder();
	    }
	}
	