package chap03;

import java.util.Scanner;

public class quiz04 {
	///배열 a의 앞 쪽 n개 요소에서 key와 같은 요소를 선형 검색(보초법)
	static int binSearch(int[] a, int n, int key) {
		System.out.print("   |");
		for(int i=0; i<n; i++)
			System.out.printf("%4d", i);
		System.out.println();
		
		System.out.print("---+");
		for(int i=0; i<4*n+2; i++)
			System.out.print("-");
		System.out.println();
		
		int start = 0; //검색 범위 맨 앞의 인덱스
		int end = n-1; //검색 범위 맨 뒤의 인덱스
		
		do {
			int center = (start+end)/2;
			System.out.print("   |");
			
			if(start != end)
				System.out.printf(String.format("%%%ds<-%%%ds+", (start*4)+1, (center - start)*4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", center*4+1), "");
			
			if(center != end)
				System.out.printf(String.format("%%%ds->\n", (end-center)*4-2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", center);
			
			for(int i=0; i<n; i++)
				System.out.printf("%4d", a[i]);
			System.out.println("\n   |");
			
			if(a[center] == key)
				return center;
			else if(a[center] < key)
				start = center+1;
			else
				end = center-1;
		} while(start<=end);
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: "); //맨 앞의 요소
		x[0] = scan.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = scan.nextInt();
			}while(x[i]< x[i-1]); //하나 앞의 요소보다 작으면 다시 입력
		}
		
		System.out.print("찾는 값: ");
		int ky = scan.nextInt();
		
		int idx = binSearch(x, num, ky); //배열 x에서 값이 ky인 요소 검색
		
		if(idx == 1)
			System.out.println(ky + "는(은) x[" + idx + "]에 있습니다.");
		else
			System.out.println("그 값의 요소는 없습니다.");
				
	}
}
