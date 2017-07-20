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
public class BubbleSort extends Sorter {

    public BubbleSort(List<Integer> data) {
        super(data);
    }

    @Override
    public void sort() {
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < data.size() - 1; i++) {
                if (data.get(i) > data.get(i + 1)) {
                    swap(i, i+1);
                    swapped = true;
                }
            }
        }
    }

}
