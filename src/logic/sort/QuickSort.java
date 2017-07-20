/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.sort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robpd
 */
public class QuickSort extends Sorter{
    
    public QuickSort(List<Integer> data){
        super("Quick Sort", data);
    }

    @Override
    public void sort() {
        data = quickSortRecursive(data, 0, data.size()-1);
    }
    
    public List<Integer> quickSortRecursive(List<Integer> array, int startIndex, int endIndex){
       int idx = partition(array, startIndex, endIndex);

        // Recursively call quicksort with left part of the partitioned array
        if (startIndex < idx - 1) {
            quickSortRecursive(array, startIndex, idx - 1);
        }

        // Recursively call quick sort with right part of the partitioned array
        if (endIndex > idx) {
            quickSortRecursive(array, idx, endIndex);
        }
        return array;
    }
    
    
    public int partition(List<Integer> array, int left, int right){
        int pivot = array.get(left); // taking first element as pivot

        while (left <= right) {
            //searching number which is greater than pivot, bottom up
            while (array.get(left) < pivot) {
                left++;
            }
            //searching number which is less than pivot, top down
            while (array.get(right) > pivot) {
                right--;
            }

            // swap the values
            if (left <= right) {
                swap(left, right);

                //increment left index and decrement right index
                left++;
                right--;
            }
        }
        return left;
    }
}
