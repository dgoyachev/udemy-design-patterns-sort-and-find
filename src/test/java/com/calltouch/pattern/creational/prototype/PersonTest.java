package com.calltouch.pattern.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
       Person p1 = new Person("John", "Smith");
       Person p2 = (Person) p1.clone();
       assertEquals(p1.getFirstName(), p2.getFirstName());
       assertEquals(p1.getLastName(), p2.getLastName());
    }
}