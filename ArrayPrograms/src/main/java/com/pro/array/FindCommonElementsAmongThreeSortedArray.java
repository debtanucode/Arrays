package com.pro.array;
/*
Find common elements in three sorted arrays
Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples:

Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80

Input:
ar1[] = {1, 5, 5}
ar2[] = {3, 4, 5, 5, 10}
ar3[] = {5, 5, 10, 20}
Output: 5, 5
 */

import java.util.HashMap;
import java.util.Map;

public class FindCommonElementsAmongThreeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        Map<Integer, Boolean> comm = new HashMap<>();
        int i;
        for(i=0;i<arr1.length ;i++){
            comm.put(arr1[i], null);
        }

        for(i=0;i<arr2.length ;i++){
            if(comm.containsKey(arr2[i])){
                comm.put(arr2[i], false);
            }
        }

        for(i=0;i<arr3.length ;i++){
            if(comm.containsKey(arr3[i]) && !comm.get(arr3[i])){
                comm.put(arr3[i], true);
            }
        }

        System.out.println("The common data :");
        for(Map.Entry<Integer, Boolean> commEntry : comm.entrySet()){
            if(commEntry.getValue()!=null && commEntry.getValue()){
                System.out.print(commEntry.getKey()+ " ");
            }
        }
    }
}
