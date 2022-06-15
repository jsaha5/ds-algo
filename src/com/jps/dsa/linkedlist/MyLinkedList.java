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

        if (!isEmpty() && index > -1 && index <= size - 1) {
            return findNodeAtIndex(index).val;
        }
        return -1;
    }

    public void addAtHead(int val) {
        var newNode = new Node(val, null);
        if (!isEmpty()) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        var newNode = new Node(val, null);
        if (!isEmpty()) {
            var lastNode = findNodeAtIndex(size - 1);
            lastNode.next = newNode;
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
                newNode.next = previousNodeOfIndex.next;
                previousNodeOfIndex.next = newNode;
                size++;
            }
        }
    }


    public void deleteAtIndex(int index) {
        if (index > -1 && index < size) {
            if (index == 0) {
                head = head.next;
            } else {
                var previousNode = findNodeAtIndex(index - 1);
                var indexNode = findNodeAtIndex(index);
                previousNode.next = indexNode.next;
            }
            size--;
        }
    }

    private Node findNodeAtIndex(int index) {
        var node = head;

        for (int i = 0; i < index; i++) {
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
