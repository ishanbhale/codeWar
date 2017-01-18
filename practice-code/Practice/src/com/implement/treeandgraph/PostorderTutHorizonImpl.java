package com.implement.treeandgraph;

import java.util.Stack;

public class PostorderTutHorizonImpl {

	public void postOrderRecursive(NodeDomainObj root) {
		if (root != null) {
			postOrderRecursive(root.left);
			postOrderRecursive(root.right);
			System.out.print(root.data + " ");
		}
	}

	public void preorderIteration(NodeDomainObj root) {
		Stack<NodeDomainObj> s1 = new Stack<NodeDomainObj>();
		Stack<NodeDomainObj> s2 = new Stack<NodeDomainObj>();
		// push the root node into first stack.
		s1.push(root);
		while (s1.isEmpty() == false) {
			// take out the root and insert into second stack.
			NodeDomainObj temp = s1.pop();
			s2.push(temp);
			// now we have the root, push the left and right child of root into
			// the first stack.
			if(temp.left!=null){
				s1.push(temp.left);
			}
			if(temp.right!=null){
				s1.push(temp.right);
			}
		}
		//once the all node are traversed, take out the nodes from second stack and print it.
		System.out.println("Preorder Traversal: ");
		while(s2.isEmpty()==false){
			System.out.print(s2.pop());
		}
	}

	public static void main(String[] args) {
		NodeDomainObj root = new NodeDomainObj(1);
		root.left = new NodeDomainObj(2);
		root.right = new NodeDomainObj(3);
		root.left.left = new NodeDomainObj(4);
		root.left.right = new NodeDomainObj(5);
		root.right.left = new NodeDomainObj(6);
		root.right.right = new NodeDomainObj(7);

		PostorderTutHorizonImpl i = new PostorderTutHorizonImpl();
		i.postOrderRecursive(root);
		System.out.println();
		i.postOrderRecursive(root);
	}

}

class NodeDomainObj {
	int data;
	NodeDomainObj left;
	NodeDomainObj right;

	public NodeDomainObj(int data) {
		this.data = data;
	}
}
