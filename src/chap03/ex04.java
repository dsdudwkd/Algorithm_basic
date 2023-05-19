package chap03;

//이진 검색

import java.util.Scanner;

public class ex04 {
	static int binSearch(int[] a, int n, int key) {
		int first = 0; //검색 범위의 첫 인덱스
		int last = n-1; //검색 범위의 끝 인덱스
		
		do {
			int center = (first+last)/2; //중앙 요소의 인덱스
 			if(a[center] == key)
				return center; //검색 성공
			else if(a[center] < key)
				first = center+1; //검색 범위를 뒤쪽 절반으로 좁힘 
			else
				last = center-1; //검색 범위를 앞쪽 절반으로 좁힘
		} while(first <= last);
		return -1; //검색 실패
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num]; //요솟수가 num인 배열
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: "); //첫 요소 입력
		x[0]= scan.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = scan.nextInt();
			}while(x[i] < x[i-1]); //바로 앞의 요소보다 작으면 다시 입력
		}
		
		System.out.print("검색할 값: ");
		int ky = scan.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}
