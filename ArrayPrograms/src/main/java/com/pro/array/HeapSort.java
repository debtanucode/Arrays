package com.pro.array;

import com.pro.util.ArrayUtil;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {100, 20, 15, 200, 23, 90, 670};
        int n= arr.length;

        heapSort(arr,n);
        ArrayUtil.displayArray(arr);
    }

    private static void heapSort(int[] arr , int n) {
        buildHeap(arr, n);

        // need to apply heapify for remaining n-1 elements.
        for(int i=n-1; i>0; i--){
            ArrayUtil.swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    private static void buildHeap(int[] arr , int n) {
        for(int i=n/2 -1; i>=0; i--){
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr , int n , int index) {
        int largest = index;
        int leftIndex= 2*index + 1;
        int rightIndex = 2*index + 2;

        if(leftIndex<n && arr[leftIndex]> arr[largest]){
            largest = leftIndex;
        }

        if(rightIndex < n && arr[rightIndex]> arr[largest]){
            largest = rightIndex;
        }

        if(index !=largest){
            ArrayUtil.swap(arr, index, largest);
            heapify(arr, n, largest);
        }
    }


}
