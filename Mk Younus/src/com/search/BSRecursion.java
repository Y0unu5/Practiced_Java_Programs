package com.search;

public class BSRecursion {
	public static int binarySearch(int arr[], int first, int last, int key) {
		if (last >= first) {
			int mid = first + (last - first) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return binarySearch(arr, first, mid - 1, key);
			} else {
				return binarySearch(arr, mid + 1, last, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 23, 3, 4, 55, 44, 22, 11, 66 };
		int key =55;
		int last = arr.length - 1;
		int result = binarySearch(arr, 0, last, key);
		if (result == -1)
			System.out.println("Element is nt found");
		else
			System.out.println("Element is found at index:" + result);
	}

}
