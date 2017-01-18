package com.practice.tree;

import java.util.Stack;

class InorderNode {
	InorderNode left;
	InorderNode right;
	int data;

	public InorderNode(int item) {
		data = item;
		left = right = null;
	}

}

public class InOrderTraversalImpl {
	InorderNode root;
void inorder(){
	if(root == null)
		return;
	Stack<InorderNode> stack = new Stack<>();
	InorderNode node = root;
	while (node!=null){
		stack.push(node);
		node = node.left;
	}
	while(stack.size()>0){
		node = stack.pop();
		System.out.println(node.data);
		if(node.right!=null){
			node = node.right;	
		while (node!=null){
				stack.push(node);
				node = node.left;
			}
		}
	
	}
}
	
	public static void main(String[] args) {
		/*
		 * InorderNode node = new InorderNode();
		 */ InOrderTraversalImpl tree = new InOrderTraversalImpl();
		tree.root = new InorderNode(1);
		tree.root.left = new InorderNode(2);
	    tree.root.right = new InorderNode(3);
	    tree.root.left.left = new InorderNode(4);
	    tree.root.left.right = new InorderNode(5);
	    tree.inorder();
	}

}
