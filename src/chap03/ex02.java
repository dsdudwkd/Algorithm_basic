package chap03;

import java.util.Scanner;

// 실습 3-1의 while문을 for문으로 구현
// 배열 a의 앞쪽 n갱 요소에서 key와 같은 요소를 선형 검색

public class ex02 {
	static int seqSearch(int[] a, int n, int key) {
		for(int i=0; i<n; i++) 
			if(a[i] == key) 
				return i; //검색 성공(인덱스 반환)
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num];

		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = scan.nextInt(); 
		}

		System.out.print("검색할 값: ");
		int search = scan.nextInt();

		int idx = seqSearch(x, num, search);
		if(idx == -1)
			System.out.println("그 값을 가진 요소는 없습니다.");
		else
			System.out.println(idx + "는(은) x[" + idx + "]에 있습니다.");
	}
}
