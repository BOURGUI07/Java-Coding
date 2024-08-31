/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.findthemedianofanarray;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class CalculateTheMedianOfAnArray {

    public static void main(String[] args) {
        process(null);
    }
    
    public static void process(int[] array){
        if(array==null){
            return;
        }
        var size = array.length;
        if(size%2!=0){
            for(int i=0;i<size;i++){
                System.out.println(array[size/2]); 
                break;
            }
        }else{
            for(int i=0;i<size;i++){
                System.out.println(Arrays.stream(new int[]{array[(size-1)/2],array[(size/2)]}).average().getAsDouble()); 
                break;
            }
        }
    }
}
