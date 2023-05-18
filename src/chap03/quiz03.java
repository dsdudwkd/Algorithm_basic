package chap03;

import java.util.Scanner;

public class quiz03 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i] == key)
				idx[count++] = i;
		}
		return count;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 arr의 요솟수: ");
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = scan.nextInt();
		}
		
		System.out.print("찾고자 하는 key 값: ");
		int key = scan.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("key 값의 개수는 " + searchIdx(arr, num, key, x) + "개 입니다.");
		
		
	}
}
