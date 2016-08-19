package edu.dpacademy.factory;

import edu.dpacademy.factory.definition.AttributeDefinition;
import edu.dpacademy.factory.definition.BooleanAttributeDefinition;
import edu.dpacademy.factory.util.AttrEnum;
import org.junit.Test;

import static org.junit.Assert.*;


public class AttributeDefinitionFactoryTest {

    @Test
    public void newAttributeDefinition_Boolean() throws Exception {

        Long id = 1L;
        String displayName="Am I fridge?";
        String internalName="com.fridgeParadox";
        Boolean value = Boolean.TRUE;

        AttributeDefinition attributeDefinition = AttributeDefinitionFactory.
                newAttributeDefinition(AttrEnum.BOOLEAN, id, internalName, displayName, value, null);

        assertTrue(attributeDefinition instanceof BooleanAttributeDefinition);
        assertEquals(id, ((BooleanAttributeDefinition) attributeDefinition).getId());
        assertEquals(displayName, ((BooleanAttributeDefinition) attributeDefinition).getDisplayName());
        assertEquals(internalName, ((BooleanAttributeDefinition) attributeDefinition).getInternalName());
        assertEquals(value, ((BooleanAttributeDefinition) attributeDefinition).getValue());

    }

}