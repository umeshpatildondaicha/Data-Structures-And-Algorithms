package dsa;

import java.util.*;
public class ZeroToLast {

	public static void main(String[] args) {
		int[] a = {1,2,0,0,4,3,0,6,3,6};
		for (int i=1,j=0;i<a.length;i++){
			if(a[j]==0 && a[i]!=0) {
				a[j++] = a[i];
				a[i] = 0;
			}else if (a[j]!=0) {
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
 