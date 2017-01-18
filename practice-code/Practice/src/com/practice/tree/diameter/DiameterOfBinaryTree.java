package com.practice.tree.diameter;

//Recursive optimized Java program to find the diameter of a
//Binary Tree

/* Class containing left and right child of current
node and key value*/
class NodeBo
{
	int data;
	NodeBo left, right;

	public NodeBo(int item)
	{
		data = item;
		left = right = null;
	}
}

/* Class to print the Diameter */
class DiameterOfBinaryTree
{
	NodeBo root;

	/* Method to calculate the diameter and return it to main */
	int diameter(NodeBo root)
	{
		/* base case if tree is empty */
		if (root == null)
			return 0;

		/* get the height of left and right sub trees */
		int lheight = height(root.left);
		int rheight = height(root.right);

		/* get the diameter of left and right subtrees */
		int ldiameter = diameter(root.left);
		int rdiameter = diameter(root.right);

		/* Return max of following three
		1) Diameter of left subtree
		2) Diameter of right subtree
		3) Height of left subtree + height of right subtree + 1 */
		System.out.println(Math.max(lheight + rheight + 1,
						Math.max(ldiameter, rdiameter)));
		System.out.println((lheight + rheight + 1));
		System.out.println(Math.max(ldiameter, rdiameter));
		System.out.println();
		System.out.println(".......................................");
		return Math.max(lheight + rheight + 1,
						Math.max(ldiameter, rdiameter));

	}

	/* A wrapper over diameter(Node root) */
	int diameter()
	{
		return diameter(root);
	}

	/*The function Compute the "height" of a tree. Height is the
	number f nodes along the longest path from the root node
	down to the farthest leaf node.*/
	static int height(NodeBo node)
	{
		/* base case tree is empty */
		if (node == null)
			return 0;

		/* If tree is not empty then height = 1 + max of left
		height and right heights */
		return (1 + Math.max(height(node.left), height(node.right)));
	}

	public static void main(String args[])
	{
		/* creating a binary tree and entering the nodes */
		DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
		tree.root = new NodeBo(1);
		tree.root.left = new NodeBo(2);
		tree.root.right = new NodeBo(3);
		tree.root.left.left = new NodeBo(4);
		tree.root.left.right = new NodeBo(5);

		System.out.println("The diameter of given binary tree is : "
						+ tree.diameter());
	}
}
