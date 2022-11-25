package com.pro.array;

import java.util.HashMap;
import java.util.Map;
/*
Subarrays with equal 1s and 0s.
Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s.

Input:
n = 7
A[] = {1,0,0,1,0,1,1}
Output: 8
Explanation: The index range for the 8
sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4),
(4, 5) ,(2, 5), (0, 5), (1, 6)
 */

public class SubArraysWithEqual1sAnd0s {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,1};
        int count = getSubArrayCount(arr);
        System.out.println(count);
    }

    private static int getSubArrayCount(int[] arr) {
        int count = 0;
        int sum = 0;
        Map<Integer,Integer> numMap = new HashMap<>();
        numMap.put(sum, 1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                sum += -1;
            }else{
                sum+= 1;
            }

            if(numMap.containsKey(sum)){
                int currentCount = numMap.get(sum);
                count = count + currentCount;
                numMap.put(sum, currentCount+ 1);
            }else{
                numMap.put(sum, 1);
            }
        }

        return count;
    }
}
