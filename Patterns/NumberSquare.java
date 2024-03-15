package Patterns;

public class NumberSquare {
    public static void main(String[] args) {
		int n=4;
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=2*n-1; j++) {
				int top = i;
				int down = (2*n)-i;
				int left = j;
				int right = (2*n)-j;
				System.out.print(n+1- Math.min(Math.min(top, down), Math.min(left, right))+ " ");
			}
			System.out.println();
		}
	}
}
