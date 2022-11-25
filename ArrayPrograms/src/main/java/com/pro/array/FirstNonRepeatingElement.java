package com.pro.array;
/*
Find first non-repeating element in a given Array of integers.
Given an array of integers of size N, the task is to find the first non-repeating element in this array.

Examples:

Input: {-1, 2, -1, 3, 0}
Output: 2
Explanation: The first number that does not repeat is : 2

Input: {9, 4, 9, 6, 7, 4}
Output: 6

 */

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        //int[] arr = {-1, 2, -1, 3, 0};
        int[] arr={9, 4, 9, 6, 7, 4};
        int n = arr.length;
        Integer nonRepeatedElement = null;
        int index = n+1;
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i=0;i<n;i++){
            if(numMap.containsKey(arr[i])){
                numMap.put(arr[i], null);
            }else{
                numMap.put(arr[i], i);
            }
        }
        for(Map.Entry<Integer, Integer> numEntry : numMap.entrySet()){
            if(numEntry.getValue()!=null && index> numEntry.getValue()){
                index = numEntry.getValue();
                nonRepeatedElement = numEntry.getKey();
            }
        }

        if(nonRepeatedElement!=null){
            System.out.println("First non repeated element is :"+ nonRepeatedElement);
        }else{
            System.out.println("There is no non repeating element.");
        }
    }
}
