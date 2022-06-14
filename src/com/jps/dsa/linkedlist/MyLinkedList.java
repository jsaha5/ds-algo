package com.jps.dsa.linkedlist;

public class MyLinkedList {
    class Node {
        private int val;
        private Node next;
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    private Node head;
    private int size;

    public int getSize() {
        return size;
    }

    public MyLinkedList() {
        this.head = null;
    }


    public int get(int index) {

        if(!isEmpty() && index > -1 && index <=size-1) {
            return findNodeAtIndex(index).val;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node newNode= new Node(val,null);
        if(!isEmpty()) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {

    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }
    private Node findNodeAtIndex(int index) {
        Node node = head;

        for (int i =0; i<index; i++) {
            node = node.next;
        }
        return node;
    }
    private boolean isEmpty() {
        if (head == null)
            return true;
        return false;
    }
}
