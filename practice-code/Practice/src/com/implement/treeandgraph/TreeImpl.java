package com.implement.treeandgraph;
import java.util.ArrayList;
import java.util.List;
public class TreeImpl {
	
	public static void main(String[] args) {
		  Node treeRootNode = new Node(null);
		  treeRootNode.setId("root");
		  // add child to root node 
		  Node childNode= addChild(treeRootNode, "child-1");
		  // add child to the child node created above
		  addChild(childNode, "child-11");
		  addChild(childNode, "child-12");
		   
		   
		  // add child to root node
		  Node child2 = addChild(treeRootNode, "child-2");
		  // add child to the child node created above
		  addChild(child2, "child-21");
		 
		   
		  printTree(treeRootNode, " ");
		 
		 }
		 
		 private static Node addChild(Node parent, String id) {
		   Node node = new Node(parent);
		   node.setId(id);
		   parent.getChildren().add(node);
		   return node;
		 }
		 
		 private static void printTree(Node node, String appender) {
		  System.out.println(appender + node.getId());
		  for (Node each : node.getChildren()) {
		   printTree(each, appender + appender);
		  }
		 }
	
}
	 
	 class Node {
	 private String id;
	 private final List<Node> children = new ArrayList<>();
	 private final Node parent;
	 
	 public Node(Node parent) {
	  this.parent = parent;
	 }
	 
	 public String getId() {
	  return id;
	 }
	 
	 public void setId(String id) {
	  this.id = id;
	 }
	 
	 public List<Node> getChildren() {
	  return children;
	 }
	 
	 public Node getParent() {
	  return parent;
	 }
	 
	
}
