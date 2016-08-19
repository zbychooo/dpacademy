package edu.dpacademy.factory.definition;

import edu.dpacademy.factory.util.UnitEnum;

public class UnitNumberAttributeDefinition extends AbstractAttributeDefinition {

    private UnitEnum unitEnum;

    public UnitNumberAttributeDefinition(Long id, String internalName, String displayName, Double value, UnitEnum unitEnum) {
        super(id, internalName, displayName, value);
        this.unitEnum = unitEnum;
    }
}
