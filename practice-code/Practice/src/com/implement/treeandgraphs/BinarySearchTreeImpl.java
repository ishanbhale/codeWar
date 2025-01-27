package com.implement.treeandgraphs;

class NodeBO{
	NodeBO left;
	NodeBO right;
	int data;
	public NodeBO(int data) {
		super();
		this.data = data;
	}
	
	
}

public class BinarySearchTreeImpl {
	NodeBO parent;
	int size;
	int data;
	BinarySearchTreeImpl(){
		parent = new NodeBO(data);
	}
	void add(int data){
		if(size == 0){
			parent.data = data;
			size++;
		}else{
			add(parent, new NodeBO(data));
		}
	}
	
	void add(NodeBO root, NodeBO node){
		if(root == null){
			return;
		}
		if(root.data>node.data){
			if(root.left== null){
			root.left = node;
			size++;
			}else{
				add(root.left, node);
			}
		}else{
			if(root.right == null){
			root.right = node;
			size++;
			}else{
				add(root.right, node);
			}
			
		}
		
		
	}

	void preOrder(NodeBO node)
	{
		if(node!=null){
			System.out.println(node.data+" ");
			preOrder(node.left);
			preOrder(node.right); 
		
			}
	}
	
	void preOrder(){
		if(parent== null){
			return;
		}else{
			System.out.println("PreOrdor Traversal:   ");
			preOrder(parent);
		}
	}
	void postOrder(NodeBO node)
	{
		if(node!=null){
			postOrder(node.left);
			postOrder(node.right); 
			System.out.println(node.data+" ");
		
			}
	}
	
	void postOrder(){
		if(parent== null){
			return;
		}else{
			System.out.println("PostOrder Traversal:   ");
			postOrder(parent);
		}
	}
	
	void inOrder(NodeBO node)
	{
		if(node!=null){
			inOrder(node.left);
			System.out.println(node.data+" ");
			inOrder(node.right); 
		
			}
	}
	
	void inOrder(){
		if(parent== null){
			return;
		}else{
			System.out.println("Inorder Traversal:   ");
			inOrder(parent);
		}
	}
	
@Override
	public String toString() {
		
		return super.toString();
	}
public static void main(String args[]){
	BinarySearchTreeImpl t = new BinarySearchTreeImpl();
	t.add(3);
    t.add(8);
    t.add(1);
    t.add(4);
    t.add(6);
    t.add(2);
    t.add(10);
    t.add(9);
    t.add(20);
    t.add(25);
    t.add(15);
    t.add(16);
    
   System.out.println(t);
   t.inOrder();
   t.preOrder();
   t.postOrder();
}
}
