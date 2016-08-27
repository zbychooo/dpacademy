package edu.dpacademy.factory;

import edu.dpacademy.factory.definition.*;
import edu.dpacademy.factory.util.AttrEnum;
import edu.dpacademy.factory.util.UnitEnum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AttributeDefinitionFactoryTest {

    @Test
    public void newAttributeDefinition_Boolean() throws Exception {

        Long id = 1L;
        String displayName = "Am I fridge?";
        String internalName = "com.fridgeParadox";
        Boolean value = Boolean.TRUE;

        AttributeDefinition attributeDefinition = AttributeDefinitionFactory.
                newAttributeDefinition(AttrEnum.BOOLEAN, id, internalName, displayName, value, null);

        assertTrue(attributeDefinition instanceof BooleanAttributeDefinition);
        assertEquals(id, ((BooleanAttributeDefinition) attributeDefinition).getId());
        assertEquals(displayName, ((BooleanAttributeDefinition) attributeDefinition).getDisplayName());
        assertEquals(internalName, ((BooleanAttributeDefinition) attributeDefinition).getInternalName());
        assertEquals(value, ((BooleanAttributeDefinition) attributeDefinition).getValue());
    }

    @Test
    public void newAttributeDefinition_Number() throws Exception {

        Long id = 1L;
        String displayName = "Vodka bottle";
        String internalName = "com.bottle.vodka";
        Double value = 0.7d;

        AttributeDefinition attributeDefinition = AttributeDefinitionFactory.
                newAttributeDefinition(AttrEnum.NUMBER, id, internalName, displayName, value, null);

        assertTrue(attributeDefinition instanceof NumberAttributeDefinition);
        assertEquals(id, ((NumberAttributeDefinition) attributeDefinition).getId());
        assertEquals(displayName, ((NumberAttributeDefinition) attributeDefinition).getDisplayName());
        assertEquals(internalName, ((NumberAttributeDefinition) attributeDefinition).getInternalName());
        assertEquals(value, ((NumberAttributeDefinition) attributeDefinition).getValue());
    }

    @Test
    public void newAttributeDefinition_String() throws Exception {

        Long id = 1L;
        String displayName = "The name of all names";
        String internalName = "com.text.loreum";
        String value = "Loreum ipsum";

        AttributeDefinition attributeDefinition = AttributeDefinitionFactory.
                newAttributeDefinition(AttrEnum.STRING, id, internalName, displayName, value, null);

        assertTrue(attributeDefinition instanceof StringAttributeDefinition);
        assertEquals(id, ((StringAttributeDefinition) attributeDefinition).getId());
        assertEquals(displayName, ((StringAttributeDefinition) attributeDefinition).getDisplayName());
        assertEquals(internalName, ((StringAttributeDefinition) attributeDefinition).getInternalName());
        assertEquals(value, ((StringAttributeDefinition) attributeDefinition).getValue());
    }

    @Test
    public void newAttributeDefinition_Unit() throws Exception {

        Long id = 1L;
        String displayName = "The distance in meters";
        String internalName = "com.distance.unit";
        Double value = 1.83;
        UnitEnum unitEnum = UnitEnum.LENGTH;

        AttributeDefinition attributeDefinition = AttributeDefinitionFactory.
                newAttributeDefinition(AttrEnum.UNIT_NUMBER, id, internalName, displayName, value, unitEnum);

        assertTrue(attributeDefinition instanceof UnitNumberAttributeDefinition);
        assertEquals(id, ((UnitNumberAttributeDefinition) attributeDefinition).getId());
        assertEquals(displayName, ((UnitNumberAttributeDefinition) attributeDefinition).getDisplayName());
        assertEquals(internalName, ((UnitNumberAttributeDefinition) attributeDefinition).getInternalName());
        assertEquals(value, ((UnitNumberAttributeDefinition) attributeDefinition).getValue());
    }
}