package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
    public static void main(String[] args) {
//        Node node = new Node(10,);
//        System.out.println(node.toString());

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addNode(10);
        sll.addNode(20);
        sll.addNode(30);
        sll.addNode(40);
        sll.addNode(50);
        System.out.println(sll.toString());
        System.out.println(sll.getSize());
        System.out.println(sll.getValue(3));
    }
}
