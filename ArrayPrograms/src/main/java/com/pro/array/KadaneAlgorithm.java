package com.pro.array;
/*
Largest Sum Contiguous Subarray (Kadane’s Algorithm)
Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum.

Input : arr= {-2, -3, 4, -1, -2, 1, 5, -3}
Output:
start index : 2
end index : 6
Maximum sum : 7
 */

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};

        int largest = getLargestSum(arr, arr.length);
        System.out.println("Maximum sum : "+largest);
    }

    private static int getLargestSum(int[] arr, int n){
        int bestSum = Integer.MIN_VALUE;
        int currSum = 0;
        int sIndex, eIndex;
        sIndex = 0;
        eIndex = 0;

        for(int i=0;i<n;i++){

            currSum+=arr[i];
            if(bestSum< currSum){
                bestSum = currSum;
                eIndex = i;
            }
            if(currSum<0){
                currSum = 0;
                sIndex = i+1;
            }
        }

        System.out.println("start index : "+ sIndex);
        System.out.println("end index : "+ eIndex);
        return  bestSum;
    }
}
