package chap06;

import java.util.Scanner;

//버블 정렬 (버전2)

public class ex02 {

	//a[idx1]와 a[idx2]의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void bubbleSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			int exchg = 0; //패스의 교환 횟수 기록
			for(int j=n-1; j>1; j--)
				if(a[j-1] >a[j]) {
					swap(a, j-1, j);
				}
			if(exchg == 0) break; //교환이 이루어지지 않으면 종료
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 2)");
		System.out.print("요솟수: ");
		int nx = scan.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = scan.nextInt();
		}
		
		bubbleSort(x, nx); //배열 x를 버블 정렬
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
	}

}
