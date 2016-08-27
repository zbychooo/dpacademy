package edu.dpacademy.strategy;

public class SearchManager {

    private Searchable searchable;

    public SearchManager(Searchable searchable) {
        this.searchable = searchable;
    }

    public Searchable getSearchable() {
        return searchable;
    }

    public void setSearchable(Searchable searchable) {
        this.searchable = searchable;
    }

    public int getSearchResult(int[] array, int element) {
        return this.searchable.search(array, element);
    }

}
