package com.pro.array;

import java.util.HashSet;
import java.util.Set;

/*
Find if there is a sub array with 0 sum.
Given an array of positive and negative numbers, find if there is a sub array (of size at least one) with 0 sum.

Examples:

Input: {4, 2, -3, 1, 6}
Output: true
Explanation:
There is a sub array with zero-sum from index 1 to 3.

Input: {4, 2, 0, 1, 6}
Output: true
Explanation: The third element is zero. A single element is also a sub-array.
 */
public class SubArrayWIth0Sum {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        boolean contain = isSubArrayContainsZeroSum(arr);
        System.out.println("Contains zero sum : "+contain);
    }

    private static boolean isSubArrayContainsZeroSum(int[] arr) {
        Set<Integer> sumSet = new HashSet<>();
        int sum =0;
        sumSet.add(sum);
        for(int i=0;i<arr.length; i++){
            sum += arr[i];
            if(arr[i]==0 || sum==0 || sumSet.contains(sum)){
                return true;
            }
            sumSet.add(sum);
        }
        return  false;
    }
}
