package com.sdajava.tree;

import java.util.LinkedList;

/**
 * Created by lukas on 13.03.2017.
 */
public class Node<T> implements INode<T> {

    private T data; //dane
    private Node<T> parent; //rodzic
    private LinkedList<Node<T>> children; //lista dzieci

    // konstruktor domyslny
    public Node(){
        parent = null;
        children = new LinkedList<Node<T>>();
    }

    //konstruktor jednoparametrowy
    public Node(Node<T> parent){
        this.parent = parent;
    }

    public Node(T data, Node<T> parent) {
        this.data = data;
        this.parent = parent;
        this.children = new LinkedList<Node<T>>();
    }

    @Override
    public Node<T> getParent() {
        return parent;
    }

    @Override
    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public int getDegree() {
        return 0;
    }

    @Override
    public Node<T> getChild(int id) {
        return children.get(id);
    }

    @Override
    public boolean isLeaf() {
        return children.isEmpty();
    }

    @Override
    public Node<T> addChild(Node<T> child) {

        child.setParent(this);
        children.add(child);

        return child;
    }

    @Override
    public Node<T> addChildData(T data) {
        Node<T> child = new Node<T>(data, this);
        children.add(child);

        return child;
    }

    @Override
    public Node<T> removeChild(int id) {
        return children.remove(id);
    }

    @Override
    public LinkedList<Node<T>> getChildren() {
        return children;
    }

    public String toString(){
        return data.toString();
    }

    public Node<T> getLeftChild(){
        if (children.isEmpty()) {
            return null;
        }
        return children.get(0);
    }

    public Node<T> getRightChildrens(){

        if(parent != null){

            LinkedList<Node<T>> childrenofParent
                = parent.getChildren();

            int index = childrenofParent.indexOf(this);
            if(childrenofParent.size() > index + 1){
                return childrenofParent.get(index+1);
            }

        }
        return null;
    }

}
