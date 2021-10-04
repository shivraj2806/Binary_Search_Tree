package com.bridgelabz;

public class BinarySearchTree_main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;

        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);

        bst.print(root);
    }
}


