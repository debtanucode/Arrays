package com.pro.array;

import com.pro.util.ArrayUtil;

/*
Sort an array of 0s, 1s and 2s | Dutch National Flag problems.

Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.

Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}

Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
 */
public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int i;
        int n0,n1, n2;
        n0 = n1 = n2 =0;
        // Iterate the array and count the number of 0,1 and 2s.
        for(i=0;i<arr.length;i++){
            switch(arr[i]){
                case 0: n0++; break;
                case 1: n1++; break;
                case 2: n2++; break;
                default:
                    System.out.println("Error occurred for : "+ arr[i]);
            }
        }
        // Starts filling the array with the values.
        i =0;
        while(i<n0){
            arr[i]=0;
            i++;
        }

        while (i<(n0+n1)){
            arr[i]=1;
            i++;
        }

        while (i<(n0+n1+n2)){
            arr[i]=2;
            i++;
        }
        // display the sorted array.
        ArrayUtil.displayArray(arr);
    }
}
