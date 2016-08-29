package edu.dpacademy.strategy;

import org.junit.Assert;
import org.junit.Test;


public class SearchManagerTest {

    @Test
    public void testLinearSearch() throws Exception {

        SearchManager searchManager = new SearchManager(new LinearSearch());
        Assert.assertTrue(searchManager.getSearchable() instanceof LinearSearch);
        Assert.assertTrue(searchManager.getSearchable() instanceof Searchable);

        int[] array = new int[]{4, 52, 41, 25, 2};
        int element = 25;
        int search = searchManager.getSearchable().search(array, element);
        Assert.assertEquals(3, search);
    }

    @Test
    public void testBinarySearch() throws Exception {

        SearchManager searchManager = new SearchManager(new BinarySearch());
        Assert.assertTrue(searchManager.getSearchable() instanceof BinarySearch);
        Assert.assertTrue(searchManager.getSearchable() instanceof Searchable);

        int[] array = new int[]{1, 4, 6, 8, 10};
        int element = 10;
        int search = searchManager.getSearchable().search(array, element);
        Assert.assertEquals(4, search);
    }
}