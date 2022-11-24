package com.pro.array;
/*
Find the Missing Number
Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.

Note: There are no duplicates in the list.

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
Output: 5
Explanation: The missing number between 1 to 8 is 5
 */

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};

        int mNum;
        mNum = findMissingNumber(arr);
        System.out.println(mNum);
        mNum = findMissingNumberUsingIndexUpdate(arr);
        System.out.println(mNum);
    }

    // find the sum of n+1 natural numbers.
    // using this formula n*(n+1)/2.
    // As the unwanted number is (n+1). So, the formula will be (n+1)*(n+2)/2 not n*(n+1)/2.
    private static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int sumOfNPlus1 = (n+1)*(n+2)/2;

        for(int i=0; i<n;i++){
            sumOfNPlus1 = sumOfNPlus1- arr[i];
        }
        return sumOfNPlus1;
    }

    private  static  int findMissingNumberUsingIndexUpdate(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int r = arr[i]%n;
            r=r-1;
            if(r>=0 && r<n) {
                arr[r] = arr[r] + n;
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]<n){
                return i+1;
            }
        }
        return -1;
    }
}
