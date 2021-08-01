package com.calltouch.search;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListSearchTest {

    @Test
    void testLinear() {
        List<Integer> elements = List.of(1,2,3,4,5,6,7);
        assertEquals(4, ListSearch.linear(elements, 5));
        assertEquals(-1, ListSearch.linear(elements, 8));
    }

    @Test
    void testBinary() {
        List<Integer> elements = List.of(1,2,3,4,5,6,7);
        assertEquals(4, ListSearch.binary(elements, 5));
        assertEquals(-1, ListSearch.binary(elements, 8));
    }

    @Test
    void testInterpolation() {
        List<Integer> elements = List.of(4,5,6,7,8,9,10,11);
        assertEquals(1, ListSearch.interpolation(elements, 5));
        assertEquals(-1, ListSearch.interpolation(elements, 2));
    }
}