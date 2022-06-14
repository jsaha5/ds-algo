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
    @DisplayName("Size should increase if we add nodes to the list")
    void testListSize() {
        list.addAtHead(10);
        list.addAtHead(11);
        assertEquals(2, list.getSize());
    }

}
