package com.implement.treeandgraph;

class Tree {
    Node root = null;
    int count = 0, temp2 = 0;

    public void insertData(int i) {
        count++;
        temp2 = count;

        root=createNode(root, i);

    }
/*
 * Here in this method I am trying to figure out at each step whether to select the left node or right node to insert the data.
 */
    private Node createNode(Node root2, int i) {

        if (root2 == null) {
            root2 = new Node(i);
        } else {

            int k = 0, temp = 0;
            for (int j = 0; j < temp2; j++) {
                temp = (int) (temp + Math.pow(2, j));
                k = j;
                if (temp2 - temp <= 0) {
                    temp = (int) (temp - Math.pow(2, j));
                    break;
                }

            }

            if (temp2 - temp <= Math.pow(2, k) / 2) {
                temp = 1;
                for (int j = 1; j < k; j++) {
                    temp = (int) (temp + Math.pow(2, j) / 2);
                }
                temp2 = temp2 - temp;
                root2.setLeft(createNode(root2.getLeft(), i));
            } else {
                temp = 1;
                for (int j = 1; j <= k; j++) {
                    temp = (int) (temp + Math.pow(2, j) / 2);
                }
                temp2 = temp2 - temp;

                root2.setRight(createNode(root2.getRight(), i));
            }

        }

        return root2;
    }

    public void printInorder()
    {
    printInorder(root);     
    }

    public void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.data + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    private class Node {
        Node left;
        Node right;
        int data;

        Node(int i) {
            data = i;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

}

public class CompleteBinaryTree {
    public static void main(String[] args) {

        Tree t = new Tree();
        t.insertData(1);
        t.insertData(2);
        t.insertData(3);
        t.insertData(4);
        t.insertData(5);
        t.insertData(6);
        t.insertData(7);
        t.insertData(8);
        t.insertData(9);
        t.insertData(10);
        t.insertData(11);
        t.insertData(12);
        t.insertData(13);
        t.insertData(14);

    t.printInorder();

    }
}