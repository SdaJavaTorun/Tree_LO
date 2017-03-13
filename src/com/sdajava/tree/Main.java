package com.sdajava.tree;

public class Main {

    public static void main(String[] args) {

        Node<String> root
            = new Node<String>("ROOT 5", null);

        Node<String> child1
            = root.addChildData("Dziecko 6");

        Node<String> child2
            = root.addChildData("Dziecko 10");

        child1.addChildData("3");
        child1.addChildData("7");

        child2.addChildData("4");
        child2.addChildData("9");

        Tree<String> tree = new Tree<String>(root);

        tree.preOrder(root);

    }
}
