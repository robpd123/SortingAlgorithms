/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.sort;

import java.util.List;

/**
 *
 * @author robpd
 */
public class InsertionSort extends Sorter {

    public InsertionSort(List<Integer> data) {
        super("Insertion sort", data);
    }

    public void sort() {
        int i = 1;

        while (i < data.size()) {
            int j = i;
            while (j > 0 && data.get(j - 1) > data.get(j)) {
                swap(j, j - 1);
                j--;
            }
            i++;
        }
    }

}
