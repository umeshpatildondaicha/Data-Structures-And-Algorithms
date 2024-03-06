package dsa;

public class LargestElementOfArray {

	public static void main(String[] args) {
		int[] ar = {2,4,6,12,4,3};
		int large = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>large) {
				large= ar[i];
			}	
		}
		System.out.println(large);

	}

}
