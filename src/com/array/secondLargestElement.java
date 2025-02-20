package com.array;

public class secondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,7,8,4,3,1};
		int temp =0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		}
		System.out.println("The second Largest Element is: "+arr[arr.length-2]);
	}

}
