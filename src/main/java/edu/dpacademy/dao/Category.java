package edu.dpacademy.dao;

public class Category {

    private Long id;
    private String name;
    private String description;
    private Long parentId;

    public Category(Long id, String name, String description, Long parentId) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Category{");
        sb.append("description='").append(description).append('\'');
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", parentId=").append(parentId);
        sb.append('}');
        return sb.toString();
    }
}
