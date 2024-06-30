package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {


	    int val;
	    CompleteBinaryTree left, right;

	    public CompleteBinaryTree(int val) {
	        this.val = val;
	        this.left = null;
	        this.right = null;
	    }
	}

	// Define the BinaryTree class
	class BinaryTree {
		CompleteBinaryTree root;

	    // Constructor
	    public BinaryTree() {
	        root = null;
	    }

	    // Function to insert a node in level order
	    public void insert(int val) {
	    	CompleteBinaryTree newNode = new CompleteBinaryTree(val);
	        if (root == null) {
	            root = newNode;
	            return;
	        }
	        insertLevelOrder(root, newNode);
	    }

	    // Function to insert nodes in level order
	    private void insertLevelOrder(CompleteBinaryTree root, CompleteBinaryTree newNode) {
	        Queue<CompleteBinaryTree> queue = new LinkedList<>();
	        queue.add(root);

	        while (!queue.isEmpty()) {
	        	CompleteBinaryTree temp = queue.poll();

	            if (temp.left == null) {
	                temp.left = newNode;
	                break;
	            } else {
	                queue.add(temp.left);
	            }

	            if (temp.right == null) {
	                temp.right = newNode;
	                break;
	            } else {
	                queue.add(temp.right);
	            }
	        }
	    }

	    // Function to print the tree level order
	    public void printLevelOrder() {
	        if (root == null) {
	            System.out.println("Tree is empty");
	            return;
	        }

	        Queue<CompleteBinaryTree> queue = new LinkedList<>();
	        queue.add(root);

	        while (!queue.isEmpty()) {
	        	CompleteBinaryTree temp = queue.poll();
	            System.out.print(temp.val + " ");

	            if (temp.left != null) {
	                queue.add(temp.left);
	            }
	            if (temp.right != null) {
	                queue.add(temp.right);
	            }
	        }
	        System.out.println();
	    }
	}

	