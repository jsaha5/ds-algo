package com.jps.dsa.linkedlist;

public class MyLinkedList {


    private Node head;
    private int size;

    public int getSize() {
        return size;
    }

    public MyLinkedList() {
        this.head = null;
    }


    public int get(int index) {

        if (!isEmpty() && index > -1 && index <= size - 1) {
            return findNodeAtIndex(index).getVal();
        }
        return -1;
    }

    public void addAtHead(int val) {
        var newNode = new Node(val, null);
        if (!isEmpty()) {
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        var newNode = new Node(val, null);
        if (!isEmpty()) {
            var lastNode = findNodeAtIndex(size - 1);
            lastNode.setNext(newNode);
        } else {
            head = newNode;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index > -1 && index <= size) {
            if (index == size) {
                addAtTail(val);
            } else if (index == 0) {
                addAtHead(val);
            } else {
                var newNode = new Node(val, null);
                var previousNodeOfIndex = findNodeAtIndex(index - 1);
                newNode.setNext(previousNodeOfIndex.getNext());
                previousNodeOfIndex.setNext(newNode);
                size++;
            }
        }
    }


    public void deleteAtIndex(int index) {
        if (index > -1 && index < size) {
            if (index == 0) {
                head = head.getNext();
            } else {
                var previousNode = findNodeAtIndex(index - 1);
                var indexNode = findNodeAtIndex(index);
                previousNode.setNext(indexNode.getNext());
            }
            size--;
        }
    }

    public Node findNodeAtIndex(int index) {
        var node = head;

        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    private boolean isEmpty() {
        if (head == null)
            return true;
        return false;
    }


}
