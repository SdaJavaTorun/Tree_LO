package com.sdajava.tree;

import java.util.LinkedList;

public interface INode<T> {

    public Node<T> getParent(); //zwracamy rodzica
    public void setParent(Node<T> parent); //ustawienie dla rodzica
    public T getData(); // pobranie przechowywanych danych
    public void setData(T data); // ustawianie danych
    public int getDegree(); // zwraca stopien wezla
    public Node<T> getChild(int id); // zwraca obiekt dziecka o danym id
    public boolean isLeaf(); // sprawdza czy wezel jest lisciem
    public Node<T> addChild(Node<T> add); //dodanie do wezla dziecka
    public Node<T> addChildData(T data); // dodaje dane do dziecka
    public Node<T> removeChild(int id); //usuwanie
    public LinkedList<Node<T>> getChildren(); // zwraca liste dzieci
    public String toString(); // wyswietla dane


}
