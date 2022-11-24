package com.pro.array;

import com.pro.util.ArrayUtil;

/*
Find duplicates in O(n) time and O(1) extra space

Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and using only constant memory space.

Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
Output: 1, 3, 6

Explanation: The numbers 1 , 3 and 6 appears more
than once in the array.

Input : n = 5 and array[] = {1, 2, 3, 4 ,3}
Output: 3

Explanation: The number 3 appears more than once
in the array.
 */
public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 6, 3, 6, 1};
        ArrayUtil.displayArray(arr);
        System.out.println();
        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr) {
        int n = arr.length;
        System.out.println("Value of n is : "+n);
        for(int i=0;i<n;i++){
            int rem= arr[i]%n;
            arr[rem] = arr[rem] + n;
        }

        ArrayUtil.displayArray(arr);
        System.out.println("The duplicate elements are :");
        for(int i=0;i<n;i++){
            if((arr[i]-n)>n){
                System.out.print(i+" ");
            }
        }
    }
}
