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
public abstract class Sorter {

    protected List<Integer> data;
    private String algorithm;

    public Sorter(String algorithm, List<Integer> data) {
        this.algorithm = algorithm;
        this.data = data;
    }

    public List<Integer> getValues() {
        return data;
    }

    public String toString() {

        return algorithm + "- " + data.toString();
    }

    public abstract void sort();

    public void swap(int indexA, int indexB) {
        int swap = data.get(indexB);

        data.set(indexB, data.get(indexA));
        data.set(indexA, swap);
    }

}
