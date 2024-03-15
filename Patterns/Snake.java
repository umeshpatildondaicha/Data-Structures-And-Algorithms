package Patterns;

import java.util.*;

public class Snake {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
//            	System.out.println(j + " : " + (j&1));
                if (j == 1) {
                    System.out.print(i + " ");
                    temp = i;
                } else if ((j & 1) == 0) {
                    temp = (n - i) * 2 + temp + 1;
                    System.out.print(temp + " ");
                } else {
                    temp = temp + ((i - (j - 1)) * 2);
                    System.out.print(temp + " ");
                }
            }
            System.out.println();
        }
	}
}
