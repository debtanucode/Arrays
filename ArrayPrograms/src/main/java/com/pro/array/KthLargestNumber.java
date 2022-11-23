package com.pro.array;

import com.pro.util.ArrayUtil;

public class KthLargestNumber {
    public static void main(String[] args) {
        int[] arr = {100, 20, 15, 200, 23, 90, 670};
        int k=5;

        sort_K_Elements(arr,arr.length, k);

        ArrayUtil.displayArray(arr);
        System.out.println("Kth largest element is : "+ arr[arr.length-k]);
    }

    private static void sort_K_Elements(int[] arr , int n, int k) {
        build_heap(arr,n);

        for(int i=n-1; i>(n-k-1) ; i--){
            // swap largest element to the end.
            int temp = arr[i];
            arr[i]= arr[0];
            arr[0]= temp;

            heapify(arr, i, 0);
        }

    }

    private static void build_heap(int[] arr , int n) {
        for(int i=n/2 - 1; i>=0;i--){
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr , int n , int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && arr[left]> arr[largest]){
            largest = left;
        }

        if(right < n && arr[right]> arr[largest]){
            largest = right;
        }

        if(i != largest){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}
