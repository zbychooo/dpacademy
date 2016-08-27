package edu.dpacademy.strategy;

import java.util.Arrays;

public class BinarySearch implements Searchable {
    public int search(int[] array, int element) {
        Arrays.sort(array); //make sure array is sorted
        int lo = 0;
        int hi = array.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (element < array[mid]) hi = mid - 1;
            else if (element > array[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
