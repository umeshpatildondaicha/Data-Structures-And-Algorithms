package Sorting;

import java.util.Arrays;

public class QuickSort {
	
	public static int partision(int[] ar, int low, int high) {
		int pivot =ar[high];
		int i=low-1;
		for (int j = low; j < high; j++) {
			if(ar[j]<=pivot) {
				int temp = ar[++i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
		int temp = ar[i+1];
		ar[i+1] = ar[high];
		ar[high] = temp;
		return i+1;
	}
	
	public static void sort(int[] ar, int low, int high) {
		if (low<high) {
			int pi = partision(ar, low, high);
			sort(ar, low, pi-1);
			sort(ar, pi+1, high);
		}
	}

	public static void main(String[] args) {
		int[] ar = {5,10,9,1,2,6,4};
		int n = ar.length;
		sort(ar, 0, n-1);
		System.out.println(Arrays.toString(ar));
		
		
	}
}
