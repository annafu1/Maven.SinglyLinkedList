package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;
    public int size = 0;
    public SinglyLinkedList() {
    }

    public void addNode(T data) {
        Node nodeToAdd = new Node(data, null);
        if (size == 0) {
            head = nodeToAdd;
        } else {
          tail.setNext(nodeToAdd);
        }
        tail = nodeToAdd;




        size++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            sb.append(temp.data + ", ");
            temp = temp.getNext();
        }
        return sb.toString();
    }


    public int getSize() {
        return size;
    }

    public T getValue(int index) {
        Node temp = head;
        for (int i = 0; i <size; i++) {
            if ( i == index) {
                return (T) temp.getData();
            }
            // [10,20] [20,40] [40,50] [50,60] [60, null]
            //   1        2       3       4       5        6

            temp = temp.getNext();
        }
        return null;
    }

//    public Integer addNode(int i) {
//        return null;
//    }
//
//    public Integer containsNode(int i) {
//        return null;
//    }
//
//    public Integer removeNode(I i) {
//        return null;
//    }
//
//    public Integer findNode(I i) {
//        return null;
//    }
//
//    public Integer sizeNode(int i) {
//        return null;
//    }
//
//
//    public I getNode(I i) {
//        return null;
//    }
//
//    public I copyNode(I i) {
//        return null;
//    }
//
//    public I sortNode(I i) {
//        return null;
//    }
}
