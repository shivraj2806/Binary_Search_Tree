package com.bridgelabz;

public class BinarySearchTree {
    // New Node Creation Method
    public Node createNewNode(int data) {
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    // Insert Method
    public Node insert(Node root, int data) {
        if (root == null) {
            return createNewNode(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // print method
    public void print(Node root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }
}

