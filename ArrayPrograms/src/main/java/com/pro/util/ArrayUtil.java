package com.pro.util;

public class ArrayUtil {
    public static void displayArray(int[] arr){
        System.out.println("Elements into the array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static void swap(int[] arr , int index1 , int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
