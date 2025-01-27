package com.practice.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraphImplAdjList{
	public static void main(String args[]) {
		Graph g = new Graph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(3, 4);
		g.addEdge(2, 3);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(4, 5);
		g.BFS(0);

	}
}

class NodeGraph {
	int dest;
	NodeGraph next;

	public NodeGraph(int d) {
		dest = d;
		next = null;
	}
}

class adjList {
	NodeGraph head;
}

class Graph {
	int V;
	adjList[] array;

	public Graph(int V) {
		this.V = V;
		array = new adjList[V]; // linked lists = number of Nodes in Graph

		for (int i = 0; i < V; i++) {
			array[i] = new adjList();
			array[i].head = null;
		}
	}

	public void addEdge(int src, int dest) {
		NodeGraph n = new NodeGraph(dest);
		n.next = array[src].head;
		array[src].head = n;
	}

	public void BFS(int startVertex) {
		boolean[] visited = new boolean[V];
		Queue<Integer> s = new LinkedList<Integer>();

		s.add(startVertex);
		while (s.isEmpty() == false) {
			int n = s.poll();
			System.out.print(" " + n);
			visited[n] = true;
			NodeGraph head = array[n].head;
			while (head != null) {
				if (visited[head.dest] == false) {
					s.add(head.dest);
					visited[head.dest] = true;
				}
				head = head.next;
			}
		}
	}
}
