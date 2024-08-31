/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sevenwaystoprintarrayelements;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author hp
 */
public class SevenWaysToPrintArrayElements {

    public static void main(String[] args) {
        print(new String[]{"a","b","c"});
    }
    
    public static void print(String[] array){
        for(var x:array){
            System.out.println(x);
        }
        
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
        Arrays.asList(array).forEach(System.out::println);
        Arrays.stream(array).forEach(System.out::println);
        Stream.of(array).forEach(System.out::println);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.stream(array).collect(Collectors.joining(", ")));
    }
}
