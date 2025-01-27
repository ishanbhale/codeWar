package com.implement.sorting;

import java.util.Arrays;

public class MyQuickSortImpl {

	static void quickSort(int [] arr, int low, int high){
		
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
		
		int middle = low + (high - low)/2;
		int pivot = arr[middle];
		
		int i = low, j = high;
		while(i<=j){
			while(arr[i]<pivot){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<=j){
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j]=temp;
			i++;
			j--;
			}
		}
		if(low<j)
		quickSort(arr, low, j);
		
		if (high>i){
			quickSort(arr, i, high);
		}
		
		}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = { 23, 19, 13, 44, 24, 19, 30 };
		int low = 0;
		int high = arr.length-1;
		quickSort(arr, low, high);
		

		for (int a : arr) {
			System.out.println(a);
		}
	}

}
