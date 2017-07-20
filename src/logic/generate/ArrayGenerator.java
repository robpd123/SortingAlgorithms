/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.generate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author robpd
 */
public class ArrayGenerator {
 
    public enum Type{
        RANDOM, INORDER, OUTORDER
    }
    
    Type type;
  
    public ArrayGenerator(){
    }
    
    public List<Integer> getList(Type type, int size){
        List<Integer> result = new ArrayList(size);
        
        switch(type){
            case INORDER:
                for (int i = 0; i < size; i++){
                    result.add(i);
                }
                break;
            case OUTORDER:
                for (int i = 0; i < size; i++){
                    result.add(size-i);
                }
                break;
            case RANDOM:
                Random rand = new Random();
                for (int i = 0; i < size; i++){
                    result.add(rand.nextInt(size));
                }
                break;
        }
        
        return result;
}
    
}
