package edu.dpacademy.dao;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {

    private static CategoryRepository instance;

    private List<Category> categoryList;

    private CategoryRepository() {
        categoryList = loadData();
    }

    public static CategoryRepository getInstance() {

        if (instance == null) {
            instance = new CategoryRepository();
        }
        return instance;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    private List<Category> loadData() {

        List<Category> categories = new ArrayList<Category>();
        categories.add(new Category(1L, "root","desc",null));
        categories.add(new Category(2L, "cat_level_1 aaa","desc",1L));
        categories.add(new Category(3L, "cat_level_1 bbb","desc",1L));
        categories.add(new Category(4L, "cat_level_2 ccc","desc",2L));
        categories.add(new Category(5L, "cat_level_2 ddd","desc",3L));
        categories.add(new Category(6L, "cat_level_2 eee","desc",3L));
        categories.add(new Category(7L, "cat_level_3 fff","desc",6L));
        categories.add(new Category(8L, "cat_level_4 ggg","desc",6L));
        return categories;
    }
}
