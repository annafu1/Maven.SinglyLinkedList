package com.zipcodewilmington.singlylinkedlist;
//[10,null] [20,null]
//[10,20] [20,30]
public class Node<T> {
    public T data;
    public Node<T> pointer;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.pointer = next;
    }

    public Node(T data) {
        this.data = data;
        this.pointer = null;
    }

    @Override
    public String toString() {
        return "Node{" + "data = " + data + ", next = " + pointer + '}';
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return pointer;
    }

    public void setNext(Node<T> next) {
        this.pointer = next;
    }
}
