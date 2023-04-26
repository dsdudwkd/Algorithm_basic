package chap03;

import java.util.Scanner;

// 선형 검색(보초법)

public class ex03 {
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0; 
		a[n] = key; //보초 추가 - 검색할 값 key를 보초로 a[n]에 대입
		
		while(true) { 
			if(a[i] == key)
				break;
			i++;
		}
		//while문에 의한 반복이 완료되면 찾은 값이 배열의 원래 데이터인지 보초인지 판단
		return i == n? -1 : i; // 변수 i값이 n이면 찾은 값이 보초이므로 검색 실패를 나타내는 -1 반환
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num+1]; //요솟수 num+1
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = scan.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = scan.nextInt();
		
		int idx = seqSearchSen(x, num, ky); //배열 x에서 값이 ky인 요소를 검색
		
		if(idx == -1)
			System.out.println("그 값의 요소는 없습니다.");
		else
			System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
	}
}
