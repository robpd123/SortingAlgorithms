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
    
    public Sorter(List<Integer> data){
        this.data = data;
    }
    
    public List<Integer> getValues(){
        return data;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        for (int i: data){
            sb.append(i).append("\n");
        }
        
        return sb.toString();
    }
    
    public abstract void sort();
    
    public void swap (int indexA, int indexB){
        int swap = data.get(indexB);
        
        data.set(indexB, data.get(indexA));
        data.set(indexA, swap);
    }
    
}
