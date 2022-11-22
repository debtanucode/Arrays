package com.pro.array;
/*
    Write a program to reverse an array.

    Input  : arr[] = {1, 2, 3}
    Output : arr[] = {3, 2, 1}

    Input :  arr[] = {4, 5, 1, 2}
    Output : arr[] = {2, 1, 5, 4}
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {100, 20, 15, 200, 23, 90, 670, 1};
        int n = arr.length;
        // reverse logic
        for(int i=0;i<n/2 ;i++){
            int temp = arr[n-1-i];
            arr[n-1-i] = arr[i];
            arr[i] = temp;
        }

        // print the result
        System.out.println("Elements after reverse :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
