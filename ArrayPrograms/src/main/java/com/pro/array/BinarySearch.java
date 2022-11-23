package com.pro.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        int item= 1;
        int index = binarySearch(arr, 0, arr.length-1, item);

        System.out.println("found in location : "+ index);
    }

    private static int binarySearch(int[] arr, int low, int high, int item){
        if(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid]== item){
                return mid;
            }else if(arr[mid]> item){
                return binarySearch(arr,low, mid-1, item);
            }else{
                return binarySearch(arr, mid+1, high, item);
            }
        }
        return -1;
    }
}
