package edu.dpacademy.builder;

public class PreferenceBuilder {
    private Object value;
    private int id;
    private String internalName;
    private String displayName;
    private String categoryName;

    public PreferenceBuilder setValue(Object value) {
        this.value = value;
        return this;
    }

    public PreferenceBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public PreferenceBuilder setInternalName(String internalName) {
        this.internalName = internalName;
        return this;
    }

    public PreferenceBuilder setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public PreferenceBuilder setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public Preference createPreference() {
        return new Preference(value, id, internalName, displayName, categoryName);
    }
}