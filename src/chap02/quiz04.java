package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class quiz04 {
	static void copy(int[] a, int[] b) {
		
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
		System.out.println("b의 배열: " + Arrays.toString(b));
		System.out.println("복사된 a의 배열: " + Arrays.toString(a));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 b의 요솟수: ");
		int num = scan.nextInt();
		int[] b = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("b[" + i + "]: ");
			b[i] = scan.nextInt();
		}
		copy(b, b);
	}
}
