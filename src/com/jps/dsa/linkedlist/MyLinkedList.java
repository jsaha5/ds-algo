package com.jps.dsa.linkedlist;

public class MyLinkedList<T> {
    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = null;
    }

    public T get(int index) {
        if (index > -1 && index <= size-1) {
            Node<T> list = head;
            for (int i = 0; i < index; i++) {
                list = list.getNext();
            }
            return list.getVal();

        } else {
            throw new RuntimeException("Invalid index: " + index);
        }

    }

    public void addAtHead(T val) {
        Node newNode = createNode(val);
        if (null != head) {
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }

    public void print() {
        if (null == head) {
            throw new RuntimeException("List is Empty");
        } else {
            Node<T> list = head;
            while (list != null) {
                System.out.println(list.getVal());
                list = list.getNext();
            }
        }
    }

    private Node createNode(T val) {
        return new Node(val, null);
    }

}
