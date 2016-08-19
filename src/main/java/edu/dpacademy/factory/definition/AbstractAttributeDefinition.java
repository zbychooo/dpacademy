package edu.dpacademy.factory.definition;

abstract class AbstractAttributeDefinition<T> implements AttributeDefinition {

    private Long id;
    private String internalName;
    private String displayName;
    private T value;

    public AbstractAttributeDefinition(Long id, String internalName, String displayName, T value) {
        this.id = id;
        this.internalName = internalName;
        this.displayName = displayName;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
