package com.array;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,1,2,2,3,4,4};
		
		int pos =1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				arr[pos] = arr[i]; 
				pos++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<pos;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
