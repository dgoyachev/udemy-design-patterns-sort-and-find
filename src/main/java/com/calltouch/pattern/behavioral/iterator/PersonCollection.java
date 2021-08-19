package com.calltouch.pattern.behavioral.iterator;

import java.util.Enumeration;
import java.util.List;

public class PersonCollection implements Enumeration<Person> {

    private int position = -1;
    private final List<Person> personList = List.of(
            new Person(21, "Nick"),
            new Person(23, "Helen"),
            new Person(35, "Sarah")
    );

    public Person current() {
        return personList.get(position);
    }

    public void reset() {
        position = -1;
    }

    @Override
    public boolean hasMoreElements() {
        return position < personList.size() -1;
    }

    @Override
    public Person nextElement() {
        if(hasMoreElements()) {
            return personList.get(++position);
        }
        return null;
    }
}
