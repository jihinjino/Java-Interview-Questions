package com.array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int arr[] = {1,2,3,4};
		for(int i=0;i<n;i++) {
			int temp = arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
