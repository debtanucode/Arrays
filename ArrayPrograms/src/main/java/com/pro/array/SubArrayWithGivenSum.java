package com.pro.array;
/*
    Given an array arr[] of non-negative integers and an integer sum, find a sub array that adds to a given sum.
    There may be more than one sub array with sum as the given sum, print first such sub array.

    Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
    Output: Sum found between indexes 2 and 4
    Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33

    Input: arr[] = {1, 4}, sum = 0
    Output: No sub array found
    Explanation: There is no sub array with 0 sum

 */
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        //int arr[] = {1, 4};
        int sum = 33;
        findSubArray(arr, sum);
    }

    private static void findSubArray(int[] arr , int sum) {
        boolean isAvailable = false;
        int sIndex, eIndex;
        int total = arr[0];
        sIndex = eIndex = 0;
        while(eIndex < arr.length && sIndex<=eIndex){
            if(sum==total){
                isAvailable = true;
                break;
            } else if (sum > total) {
                eIndex++;
                if(eIndex<arr.length) {
                    total = total + arr[eIndex];
                }
            } else {
                total = total - arr[sIndex];
                sIndex++;
            }
        }

        if(isAvailable){
            System.out.println("Start Index : "+ sIndex);
            System.out.println("End Index : "+ eIndex);
        }else{
            System.out.println("not available.");
        }
    }
}
