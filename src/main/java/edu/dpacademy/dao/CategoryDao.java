package edu.dpacademy.dao;

import java.util.List;

public interface CategoryDao {

    List<Category> findAll();

    Category findById(Long id);

    List<Category> findByName(String name);

    boolean insertCategory(Category category);

    boolean updateCategory(Long id, Category category);

    boolean deleteCategory(Long id);
}
