package com.leedtraining.doublyLinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class Evaluate {
    // Test empty list
    @Test
    public void testEmptyList() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.makeEmpty();
        dll.swapFirstLast();
        assertEquals(0, dll.getLength());
    }

    // Test single node
    @Test
    public void testSingleNode() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.swapFirstLast();
        assertEquals(1, dll.getHead().value);
        assertEquals(1, dll.getTail().value);
    }

    // Test two nodes
    @Test
    public void testTwoNodes() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.swapFirstLast();
        assertEquals(2, dll.getHead().value);
        assertEquals(1, dll.getTail().value);
    }

    // Test more than two nodes
    @Test
    public void testMoreThanTwoNodes() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.swapFirstLast();
        assertEquals(3, dll.getHead().value);
        assertEquals(1, dll.getTail().value);
        assertEquals(2, dll.getHead().next.value);
        assertEquals(1, dll.getHead().next.next.value);
    }
}
