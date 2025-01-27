package com.implement.list;

public class LinkedListImpl<T> {
	 private Node<T> head;
	 private Node<T> tail;
	void add(T element){
		Node<T> nd = new Node<T>();
		nd.setValue(element);
		if (head == null){
			head = nd;
			tail = nd;
		}
		else{
			tail.setNextRef(nd);
			tail = nd;
		}
		
		System.out.println("Adding: " + element);
	}
	void deleteAfter(T element){
		Node<T> tNode = head;
		Node<T> refNode = null;
		if(tNode == null){
			System.out.println("Node not found");
		}else{
			while(tNode!=null){
			if(tNode.compareTo(element) == 0){
				System.out.println("Element Found");
				refNode = tNode;
				break;
				}
			tNode = tNode.getNextRef();
			}
			try {
				if(refNode!=null){
					tNode = refNode.getNextRef();
					if(tNode.getNextRef() != null){
				refNode.setNextRef(tNode.getNextRef());
				}else{
					refNode.setNextRef(null);
					/*tail = refNode;*/
					System.out.println("Element Not Found");
				}

						}
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				System.out.println("Next Node does not exist");

			}
			
			
		}
	}
	void traverse(){
		Node<T> tNode = head;
		while(tNode != null){
			System.out.println(tNode.getValue());
			tNode = tNode.getNextRef();
			}
	}
	
	public static void main(String[] args) {
	LinkedListImpl<Integer> obj = new LinkedListImpl<Integer>();
	obj.add(23);
	obj.add(24);
	obj.add(25);
	obj.add(26);
	obj.traverse();
	obj.deleteAfter(27);
	obj.deleteAfter(25);
	obj.traverse();
	obj.add(26);
	System.out.println("Deleting after last node");
	obj.deleteAfter(26);
	obj.traverse();
	}

}



class NodeLinkedList<T> implements Comparable<T>{
private T value;
private NodeLinkedList<T> nextRef;
	public T getValue() {
	return value;
}
public void setValue(T value) {
	this.value = value;
}
public NodeLinkedList<T> getNextRef() {
	return nextRef;
}
public void setNextRef(NodeLinkedList<T> nextRef) {
	this.nextRef = nextRef;
}
	@Override
	public int compareTo(T o) {
		if(this.value  ==  o){
			return 0;
		}
		else{
			return 1;
		}
	}
	
}