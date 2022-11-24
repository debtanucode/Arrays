package com.pro.array;
/*
Count pairs with given sum.
Given an array of N integers, and a number sum, the task is to find the number of pairs of integers in the array whose sum is equal to sum.

Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).

Input:  arr[] = {1, 5, 7, -1, 5}, sum = 6
Output:  3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).

Input:  arr[] = {1, 1, 1, 1}, sum = 2
Output:  6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).

Input:  arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1}, sum = 11
Output:  9
Explanation: Pairs with sum 11 are (10, 1), (10, 1), (10, 1), (12, -1), (10, 1), (10, 1), (10, 1), (7, 4), (6, 5).
 */

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 2, 2,2,7, 1};
        int k=4;// test data k =6 then count = 2.

        int count = getCount(arr,k);
        System.out.println("Number of pair will be : "+ count);

    }

    private static int getCount(int[] arr, int k){
        Map<Integer,Integer> num = new HashMap<>();
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(num.containsKey(arr[i])){
                num.put(arr[i],num.get(arr[i])+1);
            }else{
                num.put(arr[i], 1);
            }
        }

        for(int i=0;i<arr.length;i++){
            int req = k - arr[i];
            if(num.containsKey(req)){
                count = count + num.get(req);
            }
            if(req == arr[i]){
                count--;
            }
        }

        return count/2;
    }
}
