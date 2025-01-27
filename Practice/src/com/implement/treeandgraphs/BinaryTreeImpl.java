package com.implement.treeandgraphs;

class Node {
	Node left;
	Node right;
	int data;
	
	boolean isAdded = false;
	public Node(int data)
    {
        this.data = data;
    }
}



public class BinaryTreeImpl {

Node parent;
int data;
int size;
int height;

	public BinaryTreeImpl() {
	super();
	parent = new Node(data);
}
	
	
	
	void add(int data){
		if(size == 0){
			parent.data = data;
			size++;
		}
		else{
	add(parent,new Node(data));
	}
		
	}
	void add(Node root, Node node){
		if(root.left == null){
			root.left = node;
			size++;
			
		}else if(root.right == null){
			root.right = node;
			size++;
			
		}
		else{
			add(root.left, node);
		}
			}

	public static void main(String[] args) {
	BinaryTreeImpl obj = new BinaryTreeImpl();
	obj.add(30);
	obj.add(40);
	obj.add(50);
	obj.add(60);
	obj.add(70);
	obj.add(80);
	obj.add(90);
	System.out.println(obj);

	}

}
