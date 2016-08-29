package edu.dpacademy.dao;

import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    private CategoryRepository repository = CategoryRepository.getInstance();

    public List<Category> findAll() {
        return repository.getCategoryList();
    }

    public Category findById(Long id) {
        for (Category category : repository.getCategoryList()) {
            if (category.getId().equals(id)) return category;
        }
        return null;
    }

    public List<Category> findByName(String name) {
        List<Category> names = new ArrayList<Category>();
        for (Category category : repository.getCategoryList()) {
            if (category.getName().equals(name)) {
                names.add(category);
            }
        }
        return names;
    }

    public boolean insertCategory(Category category) {
        return repository.getCategoryList().add(category);
    }

    public boolean updateCategory(Long id, Category category) {
        boolean deleteFlag = this.deleteCategory(id);
        if (deleteFlag) {
            return repository.getCategoryList().add(category);
        }
        return false;
    }

    public boolean deleteCategory(Long id) {
        Category toBeDeleted = this.findById(id);
        return repository.getCategoryList().remove(toBeDeleted);
    }
}
