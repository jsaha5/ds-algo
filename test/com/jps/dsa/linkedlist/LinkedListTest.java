package com.jps.dsa.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    private MyLinkedList list;

    @BeforeEach
    void init() {
        list = new MyLinkedList();
    }

    @Test
    @DisplayName("get should return -1 if index is invalid")
    void testGetInvalidIndex() {
        assertEquals(-1, list.get(0));
    }

    @Test
    @DisplayName("get should return value of the node specified at the given index")
    void testGet() {
        list.addAtHead(10);
        list.addAtHead(1);

        assertEquals(1, list.get(0));
        assertEquals(10, list.get(1));

    }

    @Test
    @DisplayName("Should be able to add node at head while list size is 0")
    void testAddAtHeadWhenListIsEmpty() {
        list.addAtHead(10);
        assertEquals(10, list.get(0));
    }


    @Test
    @DisplayName("Should be able to add node at head while list size is greater than 0")
    void testAddAtHead() {
        list.addAtHead(10);
        list.addAtHead(11);
        assertEquals(11, list.get(0));
    }

    @Test
    @DisplayName("Should be able to insert node at tail while list size is 0")
    void testAddAtTailWhenListIsEmpty() {
        list.addAtTail(10);
        assertEquals(1, list.getSize());
        assertEquals(10, list.get(0));
    }

    @Test
    @DisplayName("Should be able to insert node at tail while list size is greater than 0")
    void testAddAtTail() {
        list.addAtHead(10);
        list.addAtHead(12);
        list.addAtTail(100);
        assertEquals(3, list.getSize());
        assertEquals(100, list.get(2));
    }

    @Test
    @DisplayName("Should Be able to insert at 0th index while size is 0")
    void testInsertAt0Index() {
        list.addAtIndex(0, 1);
        assertEquals(1, list.get(0));
    }

    @Test
    @DisplayName("Should Be able to insert at last index ")
    void testInsertAtLastIndex() {
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtIndex(3, 10);
        assertEquals(3, list.get(2));
        assertEquals(10, list.get(3));
    }

    @Test
    @DisplayName("Should be able to insert node at a specified index")
    void testInsertNodeAtIndex() {
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtIndex(1, 10);

        assertEquals(10, list.get(1));
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(2));
    }

    @Test
    @DisplayName("Nodes should not be deleted if index is not valid")
    void testDeleteAtInValidIndex() {
        list.addAtHead(10);
        list.addAtHead(100);
        list.deleteAtIndex(10);
        assertEquals(2, list.getSize());
    }

    @Test
    @DisplayName("Size should increase if we add nodes to the list")
    void testListSizeOnAdd() {
        list.addAtHead(10);
        list.addAtHead(11);
        assertEquals(2, list.getSize());
    }

    @Test
    @DisplayName("Size should decrease if we add nodes to the list")
    void testListSizeOnDel() {
        list.addAtHead(10);
        list.addAtHead(11);
        list.deleteAtIndex(0);
        assertEquals(1, list.getSize());
    }

    @Test
    @DisplayName("Size should not be less that 0")
    void testListSizeNegative() {
        list.addAtHead(10);
        list.addAtHead(11);
        list.deleteAtIndex(0);
        list.deleteAtIndex(0);
        list.deleteAtIndex(0);
        assertEquals(0, list.getSize());
    }


}
