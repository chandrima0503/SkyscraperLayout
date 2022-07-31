package com.greatlearning.BSTtoSkewedTree;

class Main
{
	//declaring class variables
	Node node; 
	Node prev = null;
	Node newHead = null;
	
	void convert(Node root)
	{
		if(root == null)
			return;
		//loop till left leaf
		convert(root.left);
		Node right = root.right;
		//update new head to hold new root
		if(newHead == null)
		{
			newHead = root;
			root.left = null;
			prev = root;
		}
		else
		{
		//update the right of predecessor and also the predecessor to accomodate next node
			prev.right = root;
			root.left = null;
			prev = root;
		}
		convert(right);
	}
	
	void traverse(Node root)
	{
		//traverse till leaf
		if(root == null)
			return;
		System.out.print(root.data + " ");
		traverse(root.right);
	}
	
	public static void main(String[] args) {
	//given code to test
		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		// method to transform bst to skewed tree
		tree.convert(tree.node);
		//method to print the transformed data
		tree.traverse(tree.newHead);
	}
}