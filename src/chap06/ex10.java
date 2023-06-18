package chap06;

import java.util.Scanner;

import chap04.ex01_IntStack;

//퀵 정렬(비재귀 버전)

public class ex10 {

	//배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void quickSort(int[] a, int left, int right) {
		//스택의 생성
		ex01_IntStack lstack = new ex01_IntStack(right-left+1); //나눌 범위의 왼쪽 끝 요소의 인덱스를 저장하는 스택
		ex01_IntStack rstack = new ex01_IntStack(right-left+1); //나눌 범위의 오른쪽 끝 요소의 인덱스를 저장하는 스택

		lstack.push(left);
		rstack.push(right);

		while(lstack.isEmpty() != true) {
			int pl = left = lstack.pop(); //왼쪽 커서
			int pr = right = rstack.pop(); //오른쪽 커서
			int x = a[(left+right)/2]; //피벗

			do {
				while(a[pl] < x) pl++;
				while(a[pr] > x) pr--;
				if(pl <= pr)
					swap(a, pl++, pr--);
			}while(pl <= pr);

			if(left < pr) {
				lstack.push(left); //왼쪽 그룹 범위의
				rstack.push(pr); //인덱스를 푸쉬
			}

			if(right > pl) {
				lstack.push(pl); //오른쪽 그룹 범위의
				rstack.push(right); //인덱스를 푸쉬
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("퀵 정렬");
		System.out.print("요솟수: ");
		int nx = scan.nextInt();
		int[] x = new int[nx];

		for(int i=0; i<nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = scan.nextInt();
		}
		quickSort(x, 0, nx-1); //배열 x를 퀵 정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
	}
}
