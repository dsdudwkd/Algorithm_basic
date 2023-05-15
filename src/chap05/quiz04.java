package chap05;

import java.util.Scanner;

public class quiz04 {
	static void recur2(int n) {
		if(n>0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int num = scan.nextInt();
		
		recur2(num);
	}
}
