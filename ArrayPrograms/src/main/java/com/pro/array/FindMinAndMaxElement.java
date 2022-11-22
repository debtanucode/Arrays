package com.pro.array;

import java.util.List;

/*
    Find the minimum and maximum element in an array
 */
public class FindMinAndMaxElement {
    public static void main(String[] args) {
        int[] arr = {100, 20, 15, 200, 23, 90, 670};

        Integer min = getMinimumElement(arr);
        Integer max = getMaximumElement(arr);

        System.out.println("Minimum number is : "+ min);
        System.out.println("Maximum number is : "+ max);
    }

    private static Integer getMaximumElement(int[] arr) {
        Integer min = null;
        if(arr.length>0){
            min = arr[0];
            for(int i=1;i<arr.length;i++){
                if(min > arr[i]){
                    min= arr[i];
                }
            }
        }
        return min;
    }

    private static Integer getMinimumElement(int[] arr) {
        Integer max = null;
        if(arr.length>0){
            max= arr[0];
            for(int i=1;i<arr.length;i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
        }
        return max;
    }
}
