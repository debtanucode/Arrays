package com.pro.array;
/*
Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn)

        Examples:

        Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
        Output: 4 // x (or 2) occurs 4 times in arr[]

        Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
        Output: 1

        Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
        Output: 2

        Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
        Output: -1 // 4 doesn't occur in arr[]

 */

public class CountNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1,1,1,1,1,1,2, 2,7, 2, 2, 3};
        int n = arr.length;
        int count = occurances(arr, arr.length, 7);
        System.out.println("Occurrence is : "+ count);
    }

    private static int occurances(int[] arr, int n, int item){
        int count;
        int index = binarySearch(arr, 0, n-1, item);
        System.out.println("Index : "+ index);
        // search left side
        if(index==-1){
            return 0;
        }
        count = 1;
        if(index-1>=0 && arr[index-1] == item) {
            int left = findLeftMostElements(arr , 0 , index - 1 , item);
            System.out.println("Left Index : "+left);
            count = count + (index - left);
        }

        if((index+1<=(n-1)) && arr[index+1] == item) {
            int right = findRightMostElements(arr , index + 1, n -1 , item);
            System.out.println("Right Index : "+right);
            count = count + (right - index);
        }
        return count;
    }

    private static int findLeftMostElements(int[] arr , int low , int high , int item) {
        if(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==item){
                if(mid-1>=0 && arr[mid-1] == item) {
                    return findLeftMostElements(arr, low, mid-1, item);
                }else{
                    return mid;
                }
            }
        }
        return high;
    }

    private static int findRightMostElements(int[] arr , int low , int high , int item) {
        if(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==item){
                if(mid+1<=high && arr[mid+1] == item) {
                    return findRightMostElements(arr, mid+1, high, item);
                }else{
                    return mid;
                }
            }
        }
        return low;
    }

    private  static  int binarySearch(int[] arr, int low, int high, int item){
        int index = -1;
        if(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]== item){
                index = mid;
            } else if (arr[mid] > item) {
                index = binarySearch(arr, low, mid-1, item);
            }else{
                index = binarySearch(arr, mid+1, high, item);
            }
        }
        return index;
    }
}
