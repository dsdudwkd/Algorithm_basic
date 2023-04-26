package chap01;

import java.util.Scanner;

public class quiz01 {
	
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max4(4, 6, 2, 8)의 최댓값은 " + max4(4, 6, 2, 8));
		System.out.println("max4(1, 2, 3, 4)의 최댓값은 " + max4(1, 2, 3, 4));
		System.out.println("max4(4, 3, 6, 4)의 최댓값은 " + max4(4, 3, 6, 4));
		System.out.println("max4(3, 2, 4, 5)의 최댓값은 " + max4(3, 2, 4, 5));
		System.out.println("max4(2, 4, 3, 1)의 최댓값은 " + max4(2, 4, 3, 1));
	}
}
