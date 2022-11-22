package com.pro.array;
/*
Find a peak element which is not smaller than its neighbours

Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 and 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
 */


import java.util.ArrayList;
import java.util.List;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {100, 20, 15, 200, 23, 90, 670};

        List<Integer> peakElements = getPeakElements(arr);
        System.out.println("Peak elements are : ");
        for(Integer peakElement : peakElements){
            System.out.print(peakElement + " ");
        }
    }

    public static List<Integer> getPeakElements(int[] arr){
        List<Integer> peakElements = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            boolean isLeftLess = true;
            boolean isRightLess = true;
            if(i<arr.length-1 && arr[i]<arr[i+1]){
                isRightLess = false;
            }

            if(i>0 && arr[i-1]> arr[i]){
                isLeftLess = false;
            }

            if(isLeftLess && isRightLess){
                peakElements.add(arr[i]);
            }
        }

        return peakElements;
    }
}
