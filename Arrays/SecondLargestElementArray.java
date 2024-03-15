package Arrays;

public class SecondLargestElementArray {

	public static void main(String[] args) {
		int[] ar = {4,3,2,6,6,7,7};
//		Largest
		int large = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>large) {
				secondLarge = large;
				large = ar[i];
			}
		}
		System.out.println("Large Element of an Array : " + large);
		System.out.println("Second Large Element of an Array : " +secondLarge);
		
//		Smallest
		int smallest = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<secondSmall) {
				secondSmall = smallest;
				smallest = ar[i];
			}
		}
		System.out.println("Smallest Element of an Array : " + smallest);
		System.out.println("Second Smallest Element of an Array : " + secondSmall);
	}
}
