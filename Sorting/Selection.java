package Sorting;


import java.util.Arrays;

public class Selection {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
        
        	for(int j = i + 1; j < n; j++) {
        	    if(arr[j] < arr[i]){
        	        int temp = arr[j];
        	        arr[j] = arr[i];
        	        arr[i] = temp;
        	    }
        	}
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4, 9};
        Arrays.sort(arr);
        System.out.println(arr);
        System.out.println("Original array:");
        printArray(arr);

        // Sort the array using selection sort
        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

}