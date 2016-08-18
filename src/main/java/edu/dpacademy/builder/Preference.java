package edu.dpacademy.builder;

public class Preference {

    private int id;
    private String internalName;
    private String displayName;
    private String categoryName;
    private Object value;

    public Preference(Object value, int id, String internalName, String displayName, String categoryName) {
        this.value = value;
        this.id = id;
        this.internalName = internalName;
        this.displayName = displayName;
        this.categoryName = categoryName;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Preference{" +
                "id=" + id +
                ", internalName='" + internalName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", value=" + value +
                '}';
    }
}
