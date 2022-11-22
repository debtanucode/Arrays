package com.pro.array;

import com.pro.util.ArrayUtil;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {100, 20, 15, 200, 23, 90, 670};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        // print the array elements
        ArrayUtil.displayArray(arr);
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int p = partition(arr,low,high);
            quickSort(arr,low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    private static int partition(int[] arr , int low , int high) {
        int pivot = arr[high];
        int i=low - 1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // make a space for pivot element
        i++;
        // place the pivot element into its position.
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        // return the pivot index.
        return i;
    }


}
