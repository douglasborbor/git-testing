package org.djbv.entity;

public class Attribute<T> {
    private final String name;
    private final T value;

    public Attribute(String name, T value) {
        this.name = name;
        this.value = value;
    }
}
