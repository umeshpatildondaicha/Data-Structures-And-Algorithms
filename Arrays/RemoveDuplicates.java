package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {		
		int[] ar = {1,1,2,2,2,3,3,4,4,4,4};
		int i,j;
		for (i=0, j=0; i < ar.length-1; i++) {
			if(ar[j]!=ar[i]) {
				ar[j+1]=ar[i];
				j++;
			}
		} 
		int[] unique = new int[j+1];
		for (int k = 0; k < unique.length; k++) {
			unique[k] = ar[k];
		}
		System.out.println(Arrays.toString(unique));
	}

}
