package chap03;

import java.util.Scanner;

public class quiz02 {
	
	static int seqScanning(int[] a, int n, int key) {
		for(int i=0; i<n; i++) {
			
			System.out.println(" |" + i);
			System.out.println("---+--------------------------------");
			
			if(a[i] == key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num];
		for(int i=0; i<num; i++) {
			
			
			x[i] = scan.nextInt();
			
			
		}
		
		
		//System.out.print("검색할 값: ");
		int ky = scan.nextInt();
		
		int idx = seqScanning(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소는 없는 값입니다.");
		System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}	
