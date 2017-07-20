
import java.util.ArrayList;
import java.util.List;
import logic.generate.ArrayGenerator;
import logic.sort.BubbleSort;
import logic.sort.InsertionSort;
import logic.sort.MergeSort;
import logic.sort.QuickSort;
import logic.sort.Sorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author robpd
 */
public class Main {

    public static void main(String[] args) {
        ArrayGenerator arrayGen = new ArrayGenerator();
        
        List<Integer> toBeSorted = arrayGen.getList(ArrayGenerator.Type.OUTORDER, 10);
        
        System.out.println("to be sorted- " + toBeSorted);
        
        ArrayList<Integer> sample = new ArrayList();
        sample.add(1);
        sample.add(5);
        sample.add(4);
        sample.add(9);
        sample.add(8);
        sample.add(7);
        
        Sorter sort = new QuickSort(sample);
        
        sort.sort();
        
        System.out.println(sort);
    }
    

}
