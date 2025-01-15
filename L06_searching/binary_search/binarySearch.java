package com.L06_searching.binary_search;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4, 6, 9, 14, 16, 18, 22};
        int target = 16;
        int ans = binary(arr, target);
        System.out.println(ans);
    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
