package edu.dpacademy.factory.util;

public enum UnitEnum {

    TIME("hours", "h"),
    LENGTH("meters", "m"),
    VELOCITY("kilometers per hour", "km/h");

    String name;
    String unit;

    UnitEnum(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }
}
