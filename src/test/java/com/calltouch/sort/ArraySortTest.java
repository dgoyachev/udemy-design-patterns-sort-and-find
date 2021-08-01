package com.calltouch.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortTest {

    @Test
    void testSelection() {
        int[] elements = {4, 0, 9, 1};
        int[] result = ArraySort.selection(elements);
        assertArrayEquals(new int[]{0, 1, 4, 9}, result);
    }

    @Test
    void testBubble() {
        int[] elements = {4, 0, 9, 1};
        int[] result = ArraySort.bubble(elements);
        assertArrayEquals(new int[]{0, 1, 4, 9}, result);

        int[] orderedElements = {0, 1, 2, 3};
        result = ArraySort.bubble(orderedElements);
        assertArrayEquals(new int[]{0, 1, 2, 3}, result);
    }

    @Test
    void testQuick() {
        int[] elements = {4, 0, 9, 1};
        int[] result = ArraySort.quick(elements, 0, 3);
        assertArrayEquals(new int[]{0, 1, 4, 9}, result);
    }

    @Test
    void testMerge() {
        int[] elements = {4, 0, 9, 1};
        int[] result = ArraySort.merge(elements);
        assertArrayEquals(new int[]{0, 1, 4, 9}, result);
    }

    @Test
    void testInsertion() {
        int[] elements = {4, 0, 9, 1};
        int[] result = ArraySort.insertion(elements);
        assertArrayEquals(new int[]{0, 1, 4, 9}, result);
    }

    @Test
    void testRadix() {
        int[] elements = {401, 102, 503, 205, 188};
        int[] result = ArraySort.radix(elements);
        assertArrayEquals(new int[]{102, 188, 205, 401, 503}, result);
    }

    @Test
    void testHeap() {
        int[] elements = {4, 0, 9, 1};
        int[] result = ArraySort.heap(elements);
        assertArrayEquals(new int[]{0, 1, 4, 9}, result);
    }

    @Test
    void testShell() {
        int[] elements = {4, 0, 9, 1};
        int[] result = ArraySort.shell(elements);
        assertArrayEquals(new int[]{0, 1, 4, 9}, result);
    }
}