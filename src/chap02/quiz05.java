package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class quiz05 {
	static void rcopy(int[] a, int[] b) {
	
		for(int i=0; i<b.length; i++) {
			a[i] = b[b.length-i-1];
		}
		System.out.println("b의 배열을 역순으로 복사한 배열 a는 " + Arrays.toString(a));
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
		rcopy(b, b);
	}
}
