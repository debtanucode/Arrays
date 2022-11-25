package com.pro.array;
/*
Find the first repeating element in an array of integers.
Given an array of integers arr[], The task is to find the index of first repeating element in it i.e. the element that occurs more than once and whose index of the first occurrence is the smallest.

Examples:

Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
Output: 5
Explanation: 5 is the first element that repeats

Input: arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
Output: 6
Explanation: 6 is the first element that repeats
 */

import java.net.BindException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        //int[] arr ={6, 10, 5, 4, 9, 120, 4, 6, 10};
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = arr.length;
        Integer repeatedElement = null;
        int index = n+1;
        for(int i=0;i<n;i++){
            if(numMap.containsKey(arr[i])){
                if(index > numMap.get(arr[i])){
                    index = numMap.get(arr[i]);
                    repeatedElement = arr[i];
                }
            }else {
                numMap.put(arr[i] , i);
            }
        }

        if(repeatedElement !=null){
            System.out.println("First repeated element is : "+ repeatedElement);
        }else {
            System.out.println("There is no repeated element.");
        }
    }
}
