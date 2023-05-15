package chap05;

import java.util.Scanner;

public class quiz01 {
	
	static int factorial(int n) {
		if(n>0) {
			for(int i=n-1; i>=1; i--) {
				n *= i;
			}
			return n;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int x = scan.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
		
	}
}
