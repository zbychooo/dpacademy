package edu.dpacademy.factory;

import edu.dpacademy.factory.data.UnitEnum;

public class UnitNumberAttributeDefinition extends AbstractAttributeDefinition {

    private UnitEnum unitEnum;

    public UnitNumberAttributeDefinition(Long id, String internalName, String displayName, Object value, UnitEnum unitEnum) {
        super(id, internalName, displayName, value);
        this.unitEnum = unitEnum;
    }
}
