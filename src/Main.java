
import java.util.ArrayList;
import java.util.List;
import logic.generate.ArrayGenerator;
import logic.sort.BubbleSort;
import logic.sort.MergeSort;
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
        
        Sorter mergeSorter = new MergeSort(toBeSorted);
        
        mergeSorter.sort();
        System.out.println("\nsorted - " + mergeSorter.getValues());
    }
    
    public void timeAlgorithms(){
                    ArrayGenerator arrayGen = new ArrayGenerator();
        List<Integer> arrayA = arrayGen.getList(ArrayGenerator.Type.RANDOM, 10);

        Sorter sortA = new BubbleSort(arrayA);

        long startTimeA = System.nanoTime();
        sortA.sort();
        long endTimeA = System.nanoTime();
        System.out.println("Ran bubble sort");

        List<Integer> arrayB = arrayGen.getList(ArrayGenerator.Type.RANDOM, 10);
        
        Sorter sortB = new MergeSort(arrayB);
        
        
        long startTimeB = System.nanoTime();
        sortB.sort();
        long endTimeB = System.nanoTime();
        System.out.println("Ran merge sort");
        long durationA = (endTimeA - startTimeA);
        long durationB = (endTimeB - startTimeB);

        System.out.println("A - " + durationA);
        System.out.println("B - " + durationB);

    }
}
