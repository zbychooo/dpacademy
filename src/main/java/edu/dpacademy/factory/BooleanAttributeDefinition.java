package edu.dpacademy.factory;

public class BooleanAttributeDefinition extends AbstractAttributeDefinition {

    private BooleanAttributeDefinition(Long id, String internalName, String displayName, Boolean value) {
        super(id, internalName, displayName, value);
    }

}
