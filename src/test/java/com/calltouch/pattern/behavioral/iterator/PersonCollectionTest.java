package com.calltouch.pattern.behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonCollectionTest {

    @Test
    public void iteratorTest() {
        PersonCollection personCollection = new PersonCollection();
        while (personCollection.hasMoreElements()) {
            System.out.println(personCollection.nextElement());
        }
    }
}