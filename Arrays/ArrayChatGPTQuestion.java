package Arrays;

import java.util.*;

public class ArrayChatGPTQuestion {

	public static void main(String[] args) {

		int[] ar = {4,-7,1,2,3,9};
		
		System.out.println("Reverse an Array: Write a function to reverse an array of integers in-place.");
		System.out.println(Arrays.toString(reverseArray(ar)));
		
		System.out.println("Find the Maximum Subarray: Given an array of integers, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.");
		System.out.println(maxSubArraySum(ar));
		
		System.out.println("Rotate Array: Given an array, rotate the array to the right by k steps, where k is non-negative.");
		System.out.println(Arrays.toString(rotateByK(ar, 10)));
//		Merge Two Sorted Arrays: Given two sorted arrays, merge them into a single sorted array.
//
//		Remove Duplicates from Sorted Array: Given a sorted array, remove the duplicates in-place such that each element appears only once and return the new length.
//
//		Product of Array Except Self: Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
//		Missing Number: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//
//		Two Sum: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//		Find All Duplicates in an Array: Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once. Find all the elements that appear twice in this array.
//
//		Best Time to Buy and Sell Stock: Say you have an array for which the ith element is the price of a given stock on day i. Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

	}

//	Reverse an Array: Write a function to reverse an array of integers in-place.
	private static int[] reverseArray(int[] ar) {
		for(int i=0, j=ar.length-1; i<j; i++,j--) {
			int temp = ar[i];
			ar[i]= ar[j];
			ar[j] = temp;
		}
		return ar;
	}
	
//	Find the Maximum Sub array: Given an array of integers, find the contiguous sub array (containing at least one number) which has the largest sum and return its sum.
	private static int maxSubArraySum(int[] arr) {
        int maxSum = arr[0];  
        int currentSum = arr[0];  
        for (int i = 1; i < arr.length; i++) {  
            currentSum = max(arr[i], currentSum + arr[i]);  
            maxSum = max(maxSum, currentSum);  
        }

        return maxSum;
    }
	public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

//	Rotate Array: Given an array, rotate the array to the right by k steps, where k is non-negative.
	private static int[] rotateByK(int[] ar,int k) {
		if(k<=0)
			return ar;
		k = k%ar.length;
		for (int i = 0; i < k; i++) {
			int temp = ar[0];
			for (int j = 0; j < ar.length-1; j++) {
				ar[j] = ar[j+1];
			}
			ar[ar.length-1] = temp;
		}
		return ar;
	}
//	Merge Two Sorted Arrays: Given two sorted arrays, merge them into a single sorted array.
//
//	Remove Duplicates from Sorted Array: Given a sorted array, remove the duplicates in-place such that each element appears only once and return the new length.
//
//	Product of Array Except Self: Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
//	Missing Number: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//
//	Two Sum: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//	Find All Duplicates in an Array: Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once. Find all the elements that appear twice in this array.
//
//	Best Time to Buy and Sell Stock: Say you have an array for which the ith element is the price of a given stock on day i. Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
}
