package com.jps.dsa.linkedlist;

public class LinkedListDemo {
    public static void main (String args[]) {
        System.out.println("----Linked List demo ------");

        MyLinkedList <String> linkedList = new MyLinkedList();
        linkedList.addAtHead("Jann");
        linkedList.addAtHead("Jp");
        linkedList.addAtHead("Subhro");


        linkedList.print();
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
    }
}
