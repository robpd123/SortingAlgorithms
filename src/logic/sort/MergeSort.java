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
public class MergeSort extends Sorter {

    public MergeSort(List<Integer> data) {
        super(data);
    }

    @Override
    public void sort() {
        data = mergeSortRecursive(data);
    }
    
    public List<Integer> mergeSortRecursive(List<Integer> values) {
        if (values.size() == 1) {
            return values;
        }

        List<Integer> lowerHalf = new ArrayList(values.subList(0, values.size() / 2));
        List<Integer> upperHalf = new ArrayList(values.subList(values.size() / 2, values.size()));

        lowerHalf = mergeSortRecursive(lowerHalf);
        upperHalf = mergeSortRecursive(upperHalf);

        return merge(lowerHalf, upperHalf);
    }

    private List<Integer> merge(List<Integer> arrayA, List<Integer> arrayB) {
        List<Integer> arrayC = new ArrayList<>();

        while (!arrayA.isEmpty() && !arrayB.isEmpty()) {
            if (arrayA.get(0) > arrayB.get(0)) {
                arrayC.add(arrayB.get(0));
                arrayB.remove(0);
            } else {
                arrayC.add(arrayA.get(0));
                arrayA.remove(0);
            }
        }

        while (!arrayA.isEmpty()) {
            arrayC.add(arrayA.get(0));
            arrayA.remove(0);
        }

        while (!arrayB.isEmpty()) {
            arrayC.add(arrayB.get(0));
            arrayB.remove(0);
        }
        
        return arrayC;
    }

}
