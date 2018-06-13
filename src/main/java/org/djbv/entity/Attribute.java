package org.djbv.entity;

public class Attribute<T> {
    private final String name;
    private final T value;
    private final String description;

    public Attribute(String name, T value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public Attribute(String name, T value) {
        this(name,value,null);
    }


}
