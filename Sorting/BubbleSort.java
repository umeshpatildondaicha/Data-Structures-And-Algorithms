package Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {1,2,3,3,2,1};
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapped=true;
				}
			}
		}while(swapped);
		System.out.println(Arrays.toString(arr));
	}
}
