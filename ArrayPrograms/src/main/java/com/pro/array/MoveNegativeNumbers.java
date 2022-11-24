package com.pro.array;

import com.pro.util.ArrayUtil;

/*
Move all negative numbers to beginning and positive to end with constant extra space.
An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
 */
public class MoveNegativeNumbers {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        // move negative numbers
        int i=-1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        ArrayUtil.displayArray(arr);
    }
}
