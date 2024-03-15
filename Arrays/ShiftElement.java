package Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ShiftElement {

	public static void main(String[] args) {
		int[] ele = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.print("How manny elements you want to shift : ");
		int d = sc.nextInt();
		d=d%ele.length;
//		System.out.println(d%ele.length);
		int[] sf = new int[d];
		for (int i = 0; i < ele.length+d; i++) {
			if (i<d) {
				sf[i] = ele[i];
			}else if (i>=d && i<=ele.length-1) {
				ele[i-d] =    ele[i];
			}else {		
				ele[i-d] = sf[i-(ele.length)];
			}
		}
		System.out.println(Arrays.toString(ele));
	}
}
