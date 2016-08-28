package edu.dpacademy.dao;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class CategoryDaoImplTest {

    private static Long testId = 100L;
    private static String testName = "nnn";
    private static String testDesc = "ddd";
    private static Long parentId = 1L;
    private static Category test;

    @Before
    public void setUp() throws Exception {
        test = new Category(testId, testName, testDesc, parentId);
        List<Category> list = new ArrayList<Category>();
        // create empty
        CategoryRepository.getInstance().setCategoryList(list);
        // add test object
        CategoryRepository.getInstance().getCategoryList().add(test);
    }


    @Test
    public void findAll() throws Exception {
        CategoryDao categoryDao = new CategoryDaoImpl();
        List<Category> all = categoryDao.findAll();
        assertNotNull(all);
        assertTrue(all.size() != 0);
    }

    @Test
    public void findById() throws Exception {

        CategoryDao categoryDao = new CategoryDaoImpl();
        Category result = categoryDao.findById(testId);

        assertNotNull(result);
        assertEquals(testName, result.getName());
        assertEquals(testId, result.getId());
        assertEquals(testDesc, result.getDescription());
        assertEquals(parentId, result.getParentId());
    }

    @Test
    public void findByName() throws Exception {

        CategoryDao categoryDao = new CategoryDaoImpl();
        List<Category> byName = categoryDao.findByName(testName);

        assertNotNull(byName);
        //FIXME
        assertEquals(testName, byName.get(0).getName());
        assertEquals(testId, byName.get(0).getId());
        assertEquals(testDesc, byName.get(0).getDescription());
        assertEquals(parentId, byName.get(0).getParentId());
    }

    @Test
    public void insertCategory() throws Exception {

        CategoryDao categoryDao = new CategoryDaoImpl();

        Long newId = 300L;
        String newName = "cat name";
        String newDesc = "cat desc";
        Long parentId = 1L;
        Category newCategory = new Category(newId, newName, newDesc, parentId);

        boolean insertCategory = categoryDao.insertCategory(newCategory);
        assertTrue(insertCategory);

        Category result = categoryDao.findById(newId);
        assertNotNull(result);
        assertEquals(newName, result.getName());
        assertEquals(newId, result.getId());
        assertEquals(newDesc, result.getDescription());
        assertEquals(parentId, result.getParentId());
    }

    @Test
    public void updateCategory() throws Exception {

        CategoryDao categoryDao = new CategoryDaoImpl();

        String newName = "cat name";
        String newDesc = "cat desc";
        Long parentId = 1L;
        Category newCategory = new Category(testId, newName, newDesc, parentId);

        boolean updateCategory = categoryDao.updateCategory(testId, newCategory);
        assertTrue(updateCategory);

        Category result = categoryDao.findById(testId);
        assertNotNull(result);
        assertEquals(newName, result.getName());
        assertEquals(testId, result.getId());
        assertEquals(newDesc, result.getDescription());
        assertEquals(parentId, result.getParentId());
    }

    @Test
    public void deleteCategory() throws Exception {
        CategoryDao categoryDao = new CategoryDaoImpl();
        boolean deleteCategory = categoryDao.deleteCategory(testId);
        assertTrue(deleteCategory);
    }
}