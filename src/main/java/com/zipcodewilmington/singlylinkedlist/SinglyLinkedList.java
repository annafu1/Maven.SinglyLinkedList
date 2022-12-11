package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable> {
    public Node<T> head;
    public Node<T> tail;
    public int size = 0;

    public SinglyLinkedList() {
    }

    public void addNode(int data) {
        Node nodeToAdd = new Node(data, null);
        if (size == 0) {
            head = nodeToAdd;
        } else {
            tail.pointer = nodeToAdd;
        }
        tail = nodeToAdd;
        size++;
        // [10,20] [20,30] [30,40] [40,50] [50,60] [60, null]
    }

    public void remove(int index) {
        Node temp = head;
        if (index == 0) {
            head = head.getNext();
            size--;
        } else {
            for (int i = 0; i < size; i++) {
                if (i + 1 == index && index != size - 1) {
                    temp.pointer = temp.pointer.getNext();
                    size--;
                }
                if (i + 1 == index && index == size - 1) {
                    temp.pointer = null;
                    tail = temp;
                    size--;
                    break;
                }
                temp = temp.pointer;
            }
        }
    }

    public String toString() {
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
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return (T) temp.getData();
            }
            // [10,20] [20,30] [30,40] [40,50] [50,60] [60, null]
            //   1        2       3       4       5        6
            temp = temp.getNext();
        }
        return null;
    }

    public boolean contains(T data) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.pointer;
            index++;
        }
        return false;
    }

    public Integer find(T data) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return index;
            }
            temp = temp.pointer;
            index++;
        }

        return -1;
    }

    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> cpy = new SinglyLinkedList<T>();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            cpy.addNode((Integer) temp.data);
            temp = temp.pointer;
        }
        return cpy;
        }

    public void sort() {
        int initialSize = getSize();
        int remaining = initialSize;
        for (int i = 0; i < initialSize; i++) {
            int smallestIndex = 0;
            int smallestElement = 0;
            for (int j = 1; j < remaining; j++) {
                int currentElement = j;
                if(currentElement.compareTo(smallestElement) < 0){
                    smallestElement = currentElement;
                    smallestIndex = j;
                }
            }
            remove(smallestIndex);
            addNode(smallestElement);
            remaining--;
        }
    }


        /**
         * Method definitions:
         * add -- add an element to the list
         * size -- returns the current size of the list
         * get -- returns the element at the specified index
         * remove -- remove an element (specified by numeric index) from the list
         * find -- returns the element's index if it is in the list, -1 otherwise
         * contains -- returns true if the element is in the list, false otherwise
         * copy -- returns a new linked list containing the same values
         */
}
