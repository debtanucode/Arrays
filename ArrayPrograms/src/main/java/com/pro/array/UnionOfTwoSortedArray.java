package com.pro.array;

import com.pro.util.ArrayUtil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Union and Intersection of two sorted arrays

Given two sorted arrays, find their union and intersection.
Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6}
Output: Union : {1, 2, 3, 4, 5, 6, 7}
         Intersection : {3, 5}

Input: arr1[] = {2, 5, 6}
        arr2[] = {4, 6, 8, 10}
Output: Union : {2, 4, 5, 6, 8, 10}
         Intersection : {6}
 */
public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        System.out.println("Array 1 ---------");
        ArrayUtil.displayArray(arr1);
        System.out.println("Array 2 ---------");
        ArrayUtil.displayArray(arr2);

        getUnion(arr1 , arr2);
        getIntersection(arr1, arr2);
    }

    private static void getIntersection(int[] arr1 , int[] arr2) {
        Map<Integer, Boolean> inter= new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            inter.put(arr1[i], false);
        }

        for(int i=0;i<arr2.length;i++){
            if(inter.containsKey(arr2[i])){
                inter.put(arr2[i], true);
            }
        }

        System.out.println("\nIntersection of 2 arrays:");
        for(Map.Entry<Integer, Boolean> numEntry : inter.entrySet()){
            if(numEntry.getValue()){
                System.out.print(numEntry.getKey()+ " ");
            }
        }
    }

    private static void getUnion(int[] arr1 , int[] arr2) {
        Set<Integer> union = new HashSet<>();
        // The reason to take help of 3 for loops is to achieve the union by O(n) when n>m, where n,m are the size of the array.
        int i;
        for(i=0; i< arr1.length && i< arr2.length; i++){
            union.add(arr1[i]);
            union.add(arr2[i]);
        }

        for(; i< arr1.length; i++){
            union.add(arr1[i]);
        }
        for(; i< arr2.length; i++){
            union.add(arr2[i]);
        }

        System.out.println("\nUnion of 2 arrays:");
        for(Integer num : union){
            System.out.print(num + " ");
        }
    }
}
