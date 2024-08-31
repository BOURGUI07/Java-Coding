/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.countthenumberofwordsintext;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class CountTheNumberOfWordsInText {

    public static void main(String[] args) {
        System.out.println(process3("Hello ssss ffff"));
    }
    
    public static int process1(String text){
        
        return  text==null||text.isBlank()?0:text.split(" ").length;
    }
    
    public static int process2(String text){
        return  text==null|| text.isBlank()?0:Arrays.asList(text.split(" ")).size();
    }
    
    public static long process3(String text){
        return  text==null|| text.isBlank()?0:Arrays.stream(text.split(" ")).count();
    }
}
