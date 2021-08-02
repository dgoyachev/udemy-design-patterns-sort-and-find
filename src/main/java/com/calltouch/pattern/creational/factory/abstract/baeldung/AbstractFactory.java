package com.calltouch.pattern.creational.baeldung;

public interface AbstractFactory<T> {
    T create(String value) ;
}