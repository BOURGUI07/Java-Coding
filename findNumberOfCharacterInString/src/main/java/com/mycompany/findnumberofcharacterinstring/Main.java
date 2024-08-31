/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.findnumberofcharacterinstring;

import java.util.HashMap;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args){
        var number = process('z',"younessnn");
        System.out.println(number);
    }
    
    private static int process(char c, String word){
        var map = new HashMap<Character,Integer>();
        for(int i =0;i<word.length();i++){
            var character = word.charAt(i);
            if(map.containsKey(character)){
                map.put(character, map.get(character)+1);
            }else{
                map.put(character, 1);
            }
        }
        var doesStringContainsChar = map.keySet().contains(c);
        if(doesStringContainsChar){
            return map.get(c);
        }else{
            return 0;
        }
    }
}
