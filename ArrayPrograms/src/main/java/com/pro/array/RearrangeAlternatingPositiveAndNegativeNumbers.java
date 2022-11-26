package com.pro.array;

import com.pro.util.ArrayUtil;

/*
Rearrange array in alternating positive & negative items with O(1) extra space.
Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is followed by a negative and vice-versa maintaining the order of appearance. The number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear at the end of the array.

Examples:

Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}

Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}
 */
public class RearrangeAlternatingPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        ArrayUtil.displayArray(arr);
        rearrangeAlternatingPositiveAndNegativeNumbers(arr, arr.length);
        ArrayUtil.displayArray(arr);
    }

    private static void rearrangeAlternatingPositiveAndNegativeNumbers(int[] arr , int n) {
        for(int i=0;i<n;i++){
            if(i%2==0){
                runNegativeFlow(arr, i);
            }else{
                runPositiveFlow(arr, i);
            }
        }
    }

    private static void runPositiveFlow(int[] arr , int i) {
        int j,r,temp;
        if(arr[i]>0){
            return;
        }

        j=i+1;
        while(j<arr.length && arr[j]<0){
            j++;
        }
        if(j<arr.length && arr[j]>0) {
            temp = arr[j];
            for (r = j; r > i; r--) {
                arr[r] = arr[r - 1];
            }
            arr[i] = temp;
        }
    }

    private static void runNegativeFlow(int[] arr , int i) {
        int j,r,temp;
        if(arr[i]<0){
            return;
        }

        j=i+1;
        while(j<arr.length && arr[j]>0){
            j++;
        }
        if(j<arr.length && arr[j]<0) {
            temp = arr[j];
            for (r = j; r > i; r--) {
                arr[r] = arr[r - 1];
            }
            arr[i] = temp;
        }
    }
}
