package dsa;

public class CheckSortedArray {

	public static void main(String[] args) {
		int[] ar = {2,3,4,5,6,6,10};
		int i;
		for(i=0; i<ar.length-1; i++) {
			if(ar[i]>ar[i+1]) {
				System.out.println("Not a sorted array!");
				break;
			}
		}
		if(i==ar.length-1) {
			System.out.println("Sorted array!");
		}

	}

}
