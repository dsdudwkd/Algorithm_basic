package chap02;

import java.util.Scanner;

public class quiz03 {
	static int sumOf(int[] a) {
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = scan.nextInt();
		}
		System.out.println("배열 a의 모든 요소의 합계는 " + sumOf(arr) + "입니다."); 
	}
}
