package com.jps.dsa.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectCyclesInList {
    /***
     * Finds cycle in the list by using hash table
     * Time Complexity O(n) Space is O(n)
     * @param head
     * @return
     */
    public static boolean hasCycle(Node head) {
        Node list = head;
        Set<Node> nodes = new HashSet<>();
        while (list != null) {
            if (nodes.contains(list)) {
                return true;
            }
            nodes.add(list);
            list = list.getNext();

        }
        return false;
    }

    /***
     * Finds cycle in the list by using Floyd’s Cycle-Finding Algorithm:
     * Time Complexity O(n) Space is O(1)
     * @param head
     * @return
     */
    public static boolean findCycleFloyedAlgo(Node head) {
        Node slowPointer = head;
        Node fastPointer = head;
        while (slowPointer != null && fastPointer != null && fastPointer.getNext() != null) {

            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
            if (slowPointer == fastPointer) {
                return true;
            }

        }
        return false;
    }

    public static Node findCycleStartNode(Node head) {
        Node slowPointer = head;
        Node fastPointer = head;
        while (slowPointer != null && fastPointer != null && fastPointer.getNext() != null) {

            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
            if (slowPointer == fastPointer) {
                return slowPointer;
            }

        }
        return null;
    }

}
