package edu.dpacademy.factory.util;

public enum AttrEnum {

    BOOLEAN("Boolean", "b"),
    NUMBER("Number", "n"),
    STRING("String", "s"),
    UNIT_NUMBER("Number with Unit", "u")
    ;

    private final String name;
    private final String id;

    AttrEnum(String name, String id) {
        this.name = name;
        this.id=id;
    }
}
