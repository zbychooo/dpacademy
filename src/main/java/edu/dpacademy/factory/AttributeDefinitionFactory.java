package edu.dpacademy.factory;

import edu.dpacademy.factory.definition.*;
import edu.dpacademy.factory.exception.FactoryException;
import edu.dpacademy.factory.util.AttrEnum;
import edu.dpacademy.factory.util.UnitEnum;

public class AttributeDefinitionFactory {


    public static AttributeDefinition newAttributeDefinition(AttrEnum attrEnum, Long id, String internalName, String displayName,
                                                             Object value, UnitEnum unitEnum) throws FactoryException {

        switch (attrEnum) {

            case BOOLEAN:
                if (!(value instanceof Boolean)) {
                    throw new FactoryException("Value is not boolean type: " + value);
                }
                return new BooleanAttributeDefinition(id, internalName, displayName, (Boolean) value);

            case NUMBER:
                if (!(value instanceof Number)) {
                    throw new FactoryException("Value is not number type: " + value);
                }
                return new NumberAttributeDefinition(id, internalName, displayName, (Number) value);
            case STRING:
                if (!(value instanceof String)) {
                    throw new FactoryException("Value is not string type: " + value);
                }
                return new StringAttributeDefinition(id, internalName, displayName, (String) value);
            case UNIT_NUMBER:
                if (!(value instanceof Double)) {
                    throw new FactoryException("Value is not double type: " + value);
                }

                if (unitEnum == null) {
                    throw new FactoryException("Unit is not defined!");
                }

                return new UnitNumberAttributeDefinition(id, internalName, displayName, (Double) value, unitEnum);
            default:
                throw new FactoryException("Cannot create Attribute Definition of type: " + attrEnum);
        }
    }
}
