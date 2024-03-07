package dsa;

import java.util.*;

class CommonElement {
	private static void FindCommonElement(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<>();
        for (String s1 : arr1) {
            for (String s2 : arr2) {
                if (s1.equals(s2)) {
                    set.add(s1);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }
    
	public static void main(String[] args)
	{

		String[] arr1 = { "Kunbi", "is", "Patil", "in", "Hindu" };
		String[] arr2 = { "Umesh", "Son of", "Patil" };

		System.out.println("Array 1: "+ Arrays.toString(arr1));
		System.out.println("Array 2: "+ Arrays.toString(arr2));
        System.out.print("Common Elements: ");
		FindCommonElement(arr1, arr2);
	}
}
