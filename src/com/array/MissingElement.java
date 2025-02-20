package com.array;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
				int arr[] = {5,6,8,9,10,12};
				Arrays.sort(arr);
				for(int i=0;i<arr.length-1;i++) {
					int sum =0;
					for(int j=i+1;j<arr.length;j++) {
						sum = arr[i]+arr[j];
						break;
						}
					if(sum%2==0) {
						System.out.println(sum/2);
					}
					}		
			}

	}
