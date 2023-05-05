package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class quiz02 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			if(i == a.length-i -1) continue;
			System.out.println("a[" + i + "]과(와) a[" + (a.length-i-1) + "]를 교환합니다.");
			swap(a, i, a.length-i-1);
			print(a);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++){
			x[i] = scan.nextInt();
		}
		
		
		reverse(x);
		System.out.println(Arrays.toString(x));
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}
