package com.sdajava.tree;

/**
 * Created by lukas on 13.03.2017.
 */
public class Tree<T> {

    private Node<T> root;

    public Tree(){
        root = null;
    }

    public Tree(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void preOrder(Node<T> tree){

        System.out.println(tree);
        Node<T> value = tree.getLeftChild();

        while (value != null){
            preOrder(value);
            value = value.getRightChildrens();
        }
    }
}
