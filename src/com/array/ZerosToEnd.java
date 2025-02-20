package com.array;

import java.util.Arrays;

public class ZerosToEnd {
	
	public static void m1(int arr[]) {
		int pos =0; // 1 0 0 2 3
		int arr1[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) { 
			if(arr[i]!=0) {
				arr1[pos] = arr[i]; //1 2 3
				pos++;
			}
		}	
		System.out.println(Arrays.toString(arr1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,0,2,3};
		m1(arr);
	}

}
